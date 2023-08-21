package com.dsa.course.hashing.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PosNegPair {

	public static void main(String[] args) {

		int[] A = {1,3,6,-2,-1,-3,2,7};

		System.out.println(findPairs(A));

	}

	private static ArrayList<Integer> findPairs(int[] arr) {
		
		Set<Integer> posNumbers = new HashSet<>();
		ArrayList<Integer> pairs = new ArrayList<>();
		
		for (int num : arr) {
			if (posNumbers.contains(-num)) {
				pairs.add(-Math.abs(num));
				pairs.add(Math.abs(num));
				posNumbers.remove(-num);
			}
			else
				posNumbers.add(num);
		}
		
		return pairs;
	}

}
