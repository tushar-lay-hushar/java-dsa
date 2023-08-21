package com.dsa.course.arrays.problems;

import java.util.Scanner;

public class MajorityCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();

		int res = majority(arr, x, y);

		System.out.println(res);

		sc.close();
	}

	private static int majority(int[] arr, int x, int y) {
		int countX = 0;
		int countY = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				countX++;
			if (arr[i] == y)
				countY++;
		}
		if (countX != countY)
			return countX > countY ? x : y;
		else
			return x > y ? y : x;
	}

}
