package com.dsa.course.hashing.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayToOther {

	public static void main(String[] args) {

		int[] A = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};

		int[] B = {2, 1, 8, 3};

		System.out.println(Arrays.toString(sortA1ByA2(A, B)));

	}

	private static int[] sortA1ByA2(int[] A1, int[] A2) {
		
		int B[] = new int[A1.length];
		Map<Integer, Integer> occCount = new TreeMap<>();
		
		for (int num : A1) {
			occCount.computeIfPresent(num, (key, oldValue) -> ++oldValue);
			occCount.computeIfAbsent(num, key -> 1);
		}
		
		int i = 0;
		
		for (int num : A2) {
			if (occCount.containsKey(num)) {
				int count = occCount.get(num);
				while(count > 0) {
					B[i] = num;
					count--;
					i++;
				}
				occCount.remove(num);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : occCount.entrySet()) {
			int count = entry.getValue();
			while(count > 0) {
				B[i] = entry.getKey();
				count--;
				i++;
			}
		}
		
		return B;
	}

}
