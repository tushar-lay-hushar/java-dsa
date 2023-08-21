package com.dsa.course.hashing.problems;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3 };
		System.out.println(doUnion(arr1, arr2, arr1.length, arr2.length));

	}

	private static int doUnion(int[] a, int[] b, int n, int m) {
		
		Set<Integer> union = new HashSet<>();
		
		for (int ele : a)
			union.add(ele);
		
		for (int ele : b)
			union.add(ele);
		
		return union.size();
	}

}
