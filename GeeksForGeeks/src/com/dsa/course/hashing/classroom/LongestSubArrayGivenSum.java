package com.dsa.course.hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayGivenSum {

	public static void main(String[] args) {

		int[] A = {8, 3, 1, 5, -6, 6, 2, 2};
		int sum = 4;

		System.out.println(containsGivenSum(A, sum));

	}

	private static int  containsGivenSum(int[] arr, int sum) {
		int preSum = 0;
		int res = 0;
		int i = 0;
		Map<Integer, Integer> preSums = new HashMap<>();
		
		for (int x : arr) {
			
			preSum += x;
			
			if (preSum == sum)
				res = i + 1;
			
			if (!preSums.containsKey(preSum))
				preSums.put(preSum, i);
			
			if (preSums.containsKey(preSum - sum))
				res = Math.max(res, i - preSums.get(preSum - sum));
			
			i++;
		}
		
		return res;
	}

}
