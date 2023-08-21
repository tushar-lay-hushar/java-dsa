package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class EvenOddSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = maxEvenOddSubArray(arr);

		System.out.println(res);
		
		sc.close();
	}

	private static int maxEvenOddSubArray(int[] arr) {
		
		int res = 1;
		int curr = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
				curr++;
				res = max(res, curr);
			}
			else
				curr = 1;
		}
		return res;
	}
	
	private static int max(int a, int b) {
		return a > b ? a : b;
	}

}
