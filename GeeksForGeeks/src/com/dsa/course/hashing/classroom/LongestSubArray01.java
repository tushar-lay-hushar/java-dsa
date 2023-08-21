package com.dsa.course.hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray01 {

	public static void main(String[] args) {

		int[] A = {1, 0, 1, 1, 1, 0, 0};

		System.out.println(longestSubArray(A));

	}

	private static int  longestSubArray(int[] arr) {
		int preSum = 0;
		int res = 0;
		Map<Integer, Integer> preSums = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[i] = -1;
		}
		
		int i = 0;

		for (int x : arr) {

			preSum += x;

			if (preSum == 0)
				res = i + 1;

			if (!preSums.containsKey(preSum))
				preSums.put(preSum, i);

			if (preSums.containsKey(preSum))
				res = Math.max(res, i - preSums.get(preSum));

			i++;
		}

		return res;
	}

}
