package com.dsa.course.hashing.problems;

import java.util.Set;
import java.util.TreeSet;

public class LongConsecSubseq {

	public static void main(String[] args) {

		int[] A = {2,6,1,9,4,5,3};
		
		System.out.println(longSeq(A));

	}

	private static int longSeq(int[] arr) {
		
		Set<Integer> uniqNums = new TreeSet<>();
		
		for (int num : arr) {
			uniqNums.add(num);
		}
		
		int longLen = 1;
		int currLen = 1;
		int prevNum = -2;
		
		for (int num : uniqNums) {
			if (prevNum + 1 == num) {
				currLen++;
			}
			else
				currLen = 1;
			prevNum = num;
			if (currLen > longLen)
				longLen = currLen;
		}

		return longLen;
	}

}
