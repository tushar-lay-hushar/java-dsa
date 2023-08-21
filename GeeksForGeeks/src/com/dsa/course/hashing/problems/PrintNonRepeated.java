package com.dsa.course.hashing.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintNonRepeated {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 6, 7 };
		System.out.println(printNonRepeated(arr, arr.length));

	}

	private static ArrayList<Integer> printNonRepeated(int[] arr, int length) {
		Map<Integer, Integer> freqMap = new HashMap<>();
		ArrayList<Integer> nonRepeated = new ArrayList<>();

		for (int curr : arr) {
			freqMap.computeIfPresent(curr, (key, oldValue) -> ++oldValue);
			freqMap.computeIfAbsent(curr, key -> 1);
		}

		for (int key : arr)
			if (freqMap.get(key) == 1 && !nonRepeated.contains(key)) nonRepeated.add(key);

		return nonRepeated;
	}

}
