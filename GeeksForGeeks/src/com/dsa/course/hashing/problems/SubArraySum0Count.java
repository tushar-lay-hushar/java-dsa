package com.dsa.course.hashing.problems;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum0Count {


public static void main(String[] args) {
		
		int[] A = {0,0,5,5,0,0};

		System.out.println(countGivenSum(A));

	}

	private static int countGivenSum(int[] arr) {
		
		Map<Integer, Integer> preSumMap = new HashMap<>();
		int preSum = 0;
		int subArrayCount = 0;
		
		for (int num : arr) {
			
			preSum += num;
			
			if (preSum == 0)
				subArrayCount++;
			
			if (preSumMap.containsKey(preSum))
				subArrayCount += preSumMap.get(preSum);
			
			preSumMap.computeIfPresent(preSum, (key, oldValue) -> ++oldValue);
			preSumMap.computeIfAbsent(preSum, key -> 1);
		}
		
		System.out.println(preSumMap);
		
		return subArrayCount;
	}

}
