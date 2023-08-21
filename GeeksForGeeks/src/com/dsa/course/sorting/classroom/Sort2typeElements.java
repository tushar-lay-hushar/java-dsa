package com.dsa.course.sorting.classroom;

import java.util.Arrays;
import java.util.Scanner;

public class Sort2typeElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		sortArr(arr, arr.length - 1);

		System.out.println(Arrays.toString(arr));

		sc.close();
	}

	private static void sortArr(int[] arr, int length) {
		int i = -1;
		int j = length;
		
		while (true) {
			
			do { i++; } while(arr[i] < 0);
			do { j--; } while(arr[j] >= 0);
			
			if (i >= j)
				return;
			
			swap(arr, i, j);
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
