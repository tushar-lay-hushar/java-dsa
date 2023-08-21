package com.dsa.course.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class PairWithSum {

	public static void main(String[] args) {

		int[] A = {8, 3, 9, 4};
		int sum = 13;

		System.out.println(containsPair(A, sum));

	}

	private static boolean containsPair(int[] A, int sum) {
		
		Set<Integer> setA = new HashSet<Integer>();
		
		for(int x : A) {
			if(setA.contains(sum - x))
				return true;
			else
				setA.add(x);
		}

		return false;

	}

}
