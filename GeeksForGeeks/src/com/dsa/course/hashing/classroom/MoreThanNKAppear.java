package com.dsa.course.hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNKAppear {

	public static void main(String[] args) {

//		int[] A = {30, 10, 20, 20, 10, 20, 30, 30};
		int[] A = {30, 10, 20, 30, 30, 40, 30, 40};
		int k = 2;

		printNKAppear(A, k);
		
	}

	private static void printNKAppear(int[] arr, int k) {
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		int miniOcc = arr.length/k;
		
		for (int x : arr) {
			freqMap.computeIfPresent(x, (key, value) -> ++value);
			freqMap.computeIfAbsent(x, key -> 1);
		}
		
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() >= miniOcc)
				System.out.print(entry.getKey() + " ");
		}
		
	}

}
