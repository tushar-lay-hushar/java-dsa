package com.dsa.course.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		
		int[] A = {10, 20, 10, 30};
		int[] B = {20, 10, 10, 40};
		
		System.out.println(findIntersection(A, B));

	}
	
	private static Set<Integer> findIntersection(int[] A, int[] B) {
		
		Set<Integer> intersection = new HashSet<>();
		Set<Integer> setB = new HashSet<Integer>();
		
		for (int x : A)
			intersection.add(x);
		
		for (int x : B)
			setB.add(x);
		
		for (int x : setB) {
			if (intersection.contains(x))
				intersection.remove(x);
			else
				intersection.add(x);
		}
		
		return intersection;
		
	}

}
