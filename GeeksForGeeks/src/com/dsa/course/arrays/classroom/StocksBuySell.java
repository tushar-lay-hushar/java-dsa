package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class StocksBuySell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = totalProfit(arr);

		System.out.println(res);

		sc.close();
	}

	private static int totalProfit(int[] arr) {
		int totalProfit = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i - 1])
				totalProfit += arr[i] - arr[i - 1];
		}
		
		return totalProfit;
	}

}
