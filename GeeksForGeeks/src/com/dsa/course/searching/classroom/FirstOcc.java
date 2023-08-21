package com.dsa.course.searching.classroom;

import java.util.Scanner;

public class FirstOcc {

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
		if (low > high)
			return -1;
		
		int mid = (low + high) / 2;
		
		if (ele > arr[mid])
			return search(arr, ele, mid + 1, high);
		else if (ele < arr[mid])
			return search(arr, ele, low, mid - 1);
		else {
			if (mid == 0 || arr[mid - 1] != arr[mid])
				return mid;
			else
				return search(arr, ele, low, mid - 1);
		}
	}
}
