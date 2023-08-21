package com.dsa.course.searching.classroom;

import java.util.Scanner;

public class CountOccur {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int ele = sc.nextInt();

		int res = search(arr, ele, 0, arr.length - 1);

		System.out.println(res);

		sc.close();
	}

	private static int search(int[] arr, int ele, int low, int high) {
		int first = firstOcc(arr, ele, low, high);
		
		if (first == -1)
			return 0;
		else
			return lastOcc(arr, ele, low, high) - first + 1;
	}

	private static int firstOcc(int[] arr, int ele, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;

		if (ele > arr[mid])
			return firstOcc(arr, ele, mid + 1, high);
		else if (ele < arr[mid])
			return firstOcc(arr, ele, low, mid - 1);
		else {
			if (mid == 0 || arr[mid - 1] != arr[mid])
				return mid;
			else
				return firstOcc(arr, ele, low, mid - 1);
		}
	}

	private static int lastOcc(int[] arr, int ele, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;

		if (ele > arr[mid])
			return lastOcc(arr, ele, mid + 1, high);
		else if (ele < arr[mid])
			return lastOcc(arr, ele, low, mid - 1);
		else {
			if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
				return mid;
			else
				return lastOcc(arr, ele, mid + 1, high);
		}
	}
}
