package com.dsa.course.hashing.problems;

import java.util.HashMap;
import java.util.Map;

public class CountNonRepeated {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 6, 7 };
		System.out.println(countNonRepeated(arr, arr.length));

	}

	private static long countNonRepeated(int[] arr, int length) {
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for (int curr : arr) {
			freqMap.computeIfPresent(curr, (key, oldValue) -> ++oldValue);
			freqMap.computeIfAbsent(curr, key -> 1);
		}
		
		int nonRepeated = 0;
		
		for (int count : freqMap.values())
			if (count == 1) ++nonRepeated;
			
		return nonRepeated;
	}

}
