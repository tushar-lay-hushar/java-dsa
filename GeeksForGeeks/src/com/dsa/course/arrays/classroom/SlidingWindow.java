package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class SlidingWindow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt();

		int res = printMaxSum(arr, k);

		System.out.println(res);

		sc.close();
	}

	private static int printMaxSum(int[] arr, int k) {
		int curr = 0;
		int maxSum = 0;
		for (int i = 0; i < k; i++)
			curr += arr[i];

		for (int i = k; i < arr.length; i++) {
			curr += (arr[i] - arr[i - k]);
			maxSum = max(maxSum, curr);
		}

		return maxSum;
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

}
