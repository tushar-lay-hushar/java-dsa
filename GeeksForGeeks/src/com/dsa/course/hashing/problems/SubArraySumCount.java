package com.dsa.course.hashing.problems;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumCount {

	public static void main(String[] args) {
		
		int[] A = {10,2,-2,-20,10};
		int sum = -10;

		System.out.println(countGivenSum(A, sum));

	}

	private static int countGivenSum(int[] arr, int sum) {
		
		Map<Integer, Integer> preSumMap = new HashMap<>();
		int preSum = 0;
		int subArrayCount = 0;
		
		for (int num : arr) {
			
			preSum += num;
			
			if (preSum == sum)
				subArrayCount++;
			
			if (preSumMap.containsKey(preSum - sum))
				subArrayCount += preSumMap.get(preSum - sum);
			
			preSumMap.computeIfPresent(preSum, (key, oldValue) -> ++oldValue);
			preSumMap.computeIfAbsent(preSum, key -> 1);
		}
		
		System.out.println(preSumMap);
		
		return subArrayCount;
	}

}
