package com.dsa.course.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArrayGivenSum {

	public static void main(String[] args) {

		int[] A = {5, 8, 6, 13, 3, -1};
		int sum = 22;

		System.out.println(containsGivenSum(A, sum));

	}

	private static boolean containsGivenSum(int[] arr, int sum) {
		int preSum = 0;
		Set<Integer> preSums = new HashSet<Integer>();
		
		for (int x : arr) {
			preSum += x;
			if (preSum == sum)
				return true;
			
			if (preSums.contains(preSum - sum))
				return true;
			
			preSums.add(preSum);
		}
		
		return false;
	}

}
