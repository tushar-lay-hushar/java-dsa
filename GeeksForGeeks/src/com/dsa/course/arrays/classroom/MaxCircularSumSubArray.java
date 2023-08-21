package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class MaxCircularSumSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = overallMaxSum(arr);

		System.out.println(res);
		
		sc.close();
	}

	private static int overallMaxSum(int[] arr) {
		int maxNormal = normalMaxSum(arr);
		if (maxNormal < 0)
			return maxNormal;
		
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
			arr[i] = -arr[i];
		}
		int maxCircular = arrSum + normalMaxSum(arr);
		return max(maxNormal, maxCircular);
	}

	private static int normalMaxSum(int[] arr) {
		int res = arr[0];
		int maxEnding = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			maxEnding = max(maxEnding + arr[i], arr[i]);
			res = max(res, maxEnding);
		}
		return res;
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
