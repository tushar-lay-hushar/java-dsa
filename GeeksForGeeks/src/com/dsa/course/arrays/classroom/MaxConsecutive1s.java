package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class MaxConsecutive1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = maxCons1s(arr);

		System.out.println(res);
		
		sc.close();
	}

	private static int maxCons1s(int[] arr) {
		int maxCount = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				count = 0;
			else {
				count++;
				maxCount = max(maxCount, count);
			}
		}
		return maxCount;
	}
	
	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
