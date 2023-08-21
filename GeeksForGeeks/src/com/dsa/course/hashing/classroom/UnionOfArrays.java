package com.dsa.course.hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {

	public static void main(String[] args) {

		int[] A = {10, 20, 10, 30};
		int[] B = {20, 10, 10, 40};

		System.out.println(findUnion(A, B));

	}

	private static Set<Integer> findUnion(int[] A, int[] B) {

		Set<Integer> union = new HashSet<>();

		for (int x : A)
			union.add(x);

		for (int x : B) {
			union.add(x);
		}

		return union;

	}

}
