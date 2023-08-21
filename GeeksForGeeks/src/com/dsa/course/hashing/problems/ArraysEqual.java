package com.dsa.course.hashing.problems;

import java.util.HashMap;
import java.util.Map;

public class ArraysEqual {

	public static void main(String[] args) {

		long[] arr1 = { 1, 2, 5, 4, 0 };
		long[] arr2 = { 2, 4, 5, 0, 1 };
		System.out.println(check(arr1, arr2, arr1.length));

	}

	private static boolean check(long[] A, long[] B, int N) {
		
		Map<Long, Integer> uniqueCounts = new HashMap<>();
		
		for (long ele : A) {
			uniqueCounts.computeIfPresent(ele, (key, oldValue) -> ++oldValue);
			uniqueCounts.computeIfAbsent(ele, key -> 1);
		}
		
		for (long ele : B) {
			uniqueCounts.computeIfPresent(ele, (key, oldValue) -> --oldValue);
			uniqueCounts.computeIfAbsent(ele, key -> 1);
		}
		
		for (int value : uniqueCounts.values())
			if(value > 0)
				return false;
		
		return true;
	}

}
