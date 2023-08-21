package com.dsa.course.arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyLimtRangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int p = sc.nextInt();

		printFrequency(arr, arr.length, p);

		System.out.println(Arrays.toString(arr));

		sc.close();
	}

	private static void printFrequency(int[] arr, int n, int p) {
		for (int i = 0; i < n; i++) arr[i] -= 1;
		for (int i = 0; i < n; i++) arr[arr[i] % n] += n;
		for (int i = 0; i < n; i++) arr[i] /= n;
	}
	
	

}
