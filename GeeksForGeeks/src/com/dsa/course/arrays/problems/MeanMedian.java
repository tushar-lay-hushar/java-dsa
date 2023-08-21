package com.dsa.course.arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int resMean = mean(arr);
		int resMedian = median(arr);

		System.out.println(resMean);
		System.out.println(resMedian);

		sc.close();
	}

	private static int median(int[] arr) {
		Arrays.sort(arr);
		if (arr.length % 2 == 0)
			return (int) Math.floor((arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2);
		return arr[(arr.length / 2) + 1];
	}

	private static int mean(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return (int) Math.floor(sum / arr.length);
	}
	
	

}
