package com.dsa.course.arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = equiPoint(arr);

		System.out.println(res);

		sc.close();
	}

	private static int equiPoint(int[] arr) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		int lSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(lSum == sum - arr[i])
				return i + 1;
			lSum += arr[i];
			sum -= arr[i];
		}
		return -1;
	}

}
