package com.dsa.course.hashing.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortingEleByFreq {

	public static void main(String[] args) {
		
		int[] A = {9,9,9,2,5};

		System.out.println(sortByFreq(A));

	}

	private static ArrayList<Integer> sortByFreq(int[] arr) {
		
		Map<Integer, Integer> occCount = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int num : arr) {
			occCount.computeIfPresent(num, (key, oldValue) -> ++oldValue);
			occCount.computeIfAbsent(num, key -> 1);
		}
		
		Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> entry1, Entry<Integer, Integer> entry2) {
				return (entry2.getValue() - entry1.getValue()) == 0 ? entry1.getKey() - entry2.getKey() : entry2.getValue() - entry1.getValue();
			}
		};
		
		occCount = occCount
				.entrySet()
				.stream()
				.sorted(comparator)
				.collect(LinkedHashMap::new,
						(map, entry) -> map.put(entry.getKey(), entry.getValue()),
						LinkedHashMap::putAll);
		
		for (Map.Entry<Integer, Integer> entry : occCount.entrySet()) {
			int count = entry.getValue();
			while(count > 0) {
				list.add(entry.getKey());
				count--;
			}
		}
		
		return list;
	}

}
