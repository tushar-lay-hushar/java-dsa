package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = totalWater(arr);

		System.out.println(res);

		sc.close();
	}

	private static int totalWater(int[] arr) {
		
		int res = 0;
		int n = arr.length;
		
		int lMax[] = new int[n];
		int rMax[] = new int[n];
		
		lMax[0] = arr[0];
		
		for (int i = 1; i < n; i++)
			lMax[i] = max(arr[i], lMax[i - 1]);
		
		rMax[n - 1] = arr[n - 1];
		
		for (int i = n - 2; i >= 0; i--)
			rMax[i] = max(arr[i], rMax[i + 1]);
		
		for (int i = 1; i < n; i++)
			res = res + (min(lMax[i], rMax[i]) - arr[i]);
		
		return res;
	}
	
	private static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	private static int max(int a, int b) {
		return a > b ? a : b;
	}

}
