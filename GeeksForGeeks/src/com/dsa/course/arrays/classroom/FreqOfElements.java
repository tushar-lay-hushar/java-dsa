package com.dsa.course.arrays.classroom;

import java.util.Scanner;

public class FreqOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		printFreq(arr);

		sc.close();
	}

	private static void printFreq(int[] arr) {
		int count = 1;
		int i = 1;
		int n = arr.length;
		
		while (i < n) {
			while (i < n && arr[i] == arr[i - 1]) {
				count++;
				i++;
			}
			System.out.println(arr[i - 1] + " " + count);
			i++;
			count = 1;
		}
		if (n == 1 || arr[n - 1] != arr[n - 2])
			System.out.println(arr[n - 1] + " " + count);
	}
}
