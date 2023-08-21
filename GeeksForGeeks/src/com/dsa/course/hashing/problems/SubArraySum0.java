package com.dsa.course.hashing.problems;

import java.util.HashSet;
import java.util.Set;

public class SubArraySum0 {

	public static void main(String[] args) {

		int[] arr1 = { 4, 2, -3, 1, 6 };
		System.out.println(findsum(arr1, arr1.length));

	}

	private static boolean findsum(int[] arr, int n) {

		int preSum = 0;

		Set<Integer> preSums = new HashSet<Integer>();

		for (int x : arr) {
			preSum += x;
			if (preSums.contains(preSum))
				return true;
			if (preSum == 0)
				return true;
			preSums.add(preSum);
		}
		return false;
	}

}
