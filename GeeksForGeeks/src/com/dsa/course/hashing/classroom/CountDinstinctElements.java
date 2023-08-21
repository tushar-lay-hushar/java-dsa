package com.dsa.course.hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class CountDinstinctElements {

	public static void main(String[] args) {

		int[] A = {10, 20, 20, 50, 30, 40, 10};
		int k = 4;

		printDistinctElemenst(A, k);
		
	}

	private static void printDistinctElemenst(int[] arr, int k) {
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for (int i = 0; i < k; i++) {
			freqMap.computeIfPresent(arr[i], (key, value) -> ++value);
			freqMap.computeIfAbsent(arr[i], key -> 1);
		}
		
		for (int i = 4; i < arr.length; i++) {
			System.out.println(freqMap.size());
			freqMap.compute(arr[i - k], (key, value) -> --value);
			
			if(freqMap.get(arr[i - k]) == 0)
				freqMap.remove(arr[i - k]);
			
			freqMap.computeIfPresent(arr[i], (key, value) -> ++value);
			freqMap.computeIfAbsent(arr[i], key -> 1);
			
			
		}
	}
}
