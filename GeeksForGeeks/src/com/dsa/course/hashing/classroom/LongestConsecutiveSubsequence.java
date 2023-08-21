package com.dsa.course.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {

		int[] A = {1, 3, 4, 3, 3, 2, 9, 10};

		System.out.println(findLongestSubSeq(A));
		
	}

	private static int findLongestSubSeq(int[] arr) {
		
		Set<Integer> arrSet = new HashSet<>();
		
		for (int x : arr)
			arrSet.add(x);
		
		int res = 0;
		int nextNum = 0;
		for (int x : arrSet) {
			if (arrSet.contains(x - 1))
				continue;
			
			nextNum = x;
			
			int curr = 1;
			while(arrSet.contains(++nextNum))
				curr++;
			
			if(curr > res)
				res = curr;
		}
		
		return res;
	}

}
