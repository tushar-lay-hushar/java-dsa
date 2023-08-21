package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class SumOfSubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int sum = sc.nextInt();

		int res = countSubsets(arr, n , sum);
		
		System.out.println(res);
		
		sc.close();
	}

	private static int countSubsets(int[] arr, int n, int sum) {
		if (n == 0)
			return (sum == 0) ? 1: 0;
		return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n - 1]);
	}
}
