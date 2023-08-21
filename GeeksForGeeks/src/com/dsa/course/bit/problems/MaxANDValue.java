package com.dsa.course.bit.problems;

import java.util.Scanner;

public class MaxANDValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = findMaxANDValue(arr, arr.length);

		System.out.println(res);

		sc.close();
	}

	private static int findMaxANDValue(int[] arr, int N) {
		int res = 0;
		for (int bit = 31; bit >= 0; bit--) {
			int count = 0;
			int pattern = res | 1 << bit;
			for (int i = 0; i < N; i++) {
				if ((pattern & arr[i]) == pattern)
					count++;
			}
			if (count >= 2)
				res = pattern;
		}
		return res;
	}
}
