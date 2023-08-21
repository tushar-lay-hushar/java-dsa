package com.dsa.course.sorting.classroom;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int m = sc.nextInt();
		
		int res = minDiff(arr, arr.length - 1, m);

		System.out.println(res);

		sc.close();
	}
	
	private static int minDiff(int arr[], int n, int m) {
		if (m > n) return -1;
		
		Arrays.sort(arr);
		
		int res = arr[m - 1] - arr[0];
		for (int i = 1; (i + m - 1) < n; i++)
			res = min(res, (arr[i + m - 1] - arr[i]));
		
		return res;
	}

	private static int min(int num1, int num2) {
		return num1 < num2 ? num1 : num2;
	}
}
