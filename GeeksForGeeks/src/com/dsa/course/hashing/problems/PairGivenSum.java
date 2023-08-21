package com.dsa.course.hashing.problems;

import java.util.HashSet;
import java.util.Set;

public class PairGivenSum {
	
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 14;
		System.out.println(sumExists(arr1, arr1.length, sum));

	}

	private static int sumExists(int[] arr, int N, int sum) {
		
		Set<Integer> unique = new HashSet<>();
		
		for (int ele : arr) {
			if (unique.contains(sum - ele))
				return 1;
			unique.add(ele);
		}
		
		return 0;
	}

}
