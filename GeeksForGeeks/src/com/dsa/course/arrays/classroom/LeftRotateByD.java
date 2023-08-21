package com.dsa.course.arrays.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int d = sc.nextInt();

		rotateByD(arr, d);

		System.out.println(d);
		System.out.println(Arrays.toString(arr));

		sc.close();
	}

	private static void rotateByD(int[] arr, int d) {
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, arr.length - 1);
		reverseArray(arr, 0, arr.length - 1);
		
	}

	private static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
