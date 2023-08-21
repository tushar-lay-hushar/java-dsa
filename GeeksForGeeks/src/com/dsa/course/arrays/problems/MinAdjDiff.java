package com.dsa.course.arrays.problems;

import java.util.Scanner;

public class MinAdjDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt(); 

		int res = minAdjDiff(arr);

		System.out.println(res);

		sc.close();
	}

	private static int minAdjDiff(int[] arr) {
		int minDiff = Integer.MAX_VALUE;
		int currMinDiff = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				currMinDiff = arr[i] - arr[0];
			else
				currMinDiff = Math.abs(arr[i] - arr[i + 1]);
			if (currMinDiff < minDiff)
				minDiff = currMinDiff;
		}
		return minDiff;
	}

}
