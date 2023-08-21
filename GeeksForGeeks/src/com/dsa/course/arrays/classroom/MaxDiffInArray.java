package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class MaxDiffInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = maxDiff(arr);
		
		System.out.println(res);

		sc.close();
	}

	private static int maxDiff(int[] arr) {
		int res = arr[1] - arr[0];
		int minVal = arr[0];
		
		for (int i = 1 ; i < arr.length; i++) {
			res = max(res, arr[i] - minVal);
			minVal = min(minVal, arr[i]);
		}
		return res;
	}
	
	private static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	private static int max(int a, int b) {
		return a > b ? a : b;
	}

}
