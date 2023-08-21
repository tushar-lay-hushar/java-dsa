package com.dsa.course.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArrayZeroSum {

	public static void main(String[] args) {

		int[] A = {-3, 4, -3, -1, 1};

		System.out.println(containsZeroSum(A));

	}

	private static boolean containsZeroSum(int[] arr) {
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
