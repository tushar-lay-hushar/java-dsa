package com.dsa.course.hashing.problems;

import java.util.HashMap;
import java.util.Map;

public class SubArray01Count {

	public static void main(String[] args) {

		int[] A = {1,0,0,1,0,1,1};

		System.out.println(countSubArray(A));

	}

	private static int countSubArray(int[] arr) {
		int preSum = 0;
		int res = 0;
		Map<Integer, Integer> preSums = new HashMap<>();
		preSums.put(0, 1);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[i] = -1;
		}

		for (int x : arr) {

			preSum += x;
			
			if (preSums.containsKey(preSum))
				res += preSums.get(preSum);
			
			preSums.computeIfPresent(preSum, (key, oldValue) -> ++oldValue);
			preSums.computeIfAbsent(preSum, key -> 1);
		}

		return res;
	}

}
