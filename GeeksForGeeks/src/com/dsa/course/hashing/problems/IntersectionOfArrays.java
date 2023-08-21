package com.dsa.course.hashing.problems;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 3, 4, 3, 5, 6 };
		int[] arr2 = { 1, 5, 3, 4, 3, 5, 6 };
		System.out.println(numberofElementsInIntersection(arr1, arr2, arr1.length, arr2.length));

	}

	private static int numberofElementsInIntersection(int[] a, int[] b, int n, int m) {
		
		Set<Integer> allEle = new HashSet<>();
		int intersectionCount = 0;
		
		for (int ele : a) {
			allEle.add(ele);
		}
		
		for (int ele : b) {
			if (allEle.contains(ele)) {
				allEle.remove(ele);
				intersectionCount++;
			}
		}
		
		return intersectionCount;
	}

}
