package com.dsa.course.hashing.problems;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeated {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 4, 3, 5, 6 };
		System.out.println(firstRepeated(arr, arr.length));

	}

	private static int firstRepeated(int[] arr, int length) {
		
		Set<Integer> firstRepeatSet = new HashSet<>();
		
		int firstRepeatIndex = -2;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(firstRepeatSet.contains(arr[i])) {
				firstRepeatIndex = i;
			}
			else
				firstRepeatSet.add(arr[i]);
		}
			
		return firstRepeatIndex + 1;
	}

}
