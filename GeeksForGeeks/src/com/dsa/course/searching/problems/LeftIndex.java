package com.dsa.course.searching.problems;

import java.util.Scanner;

public class LeftIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int x = sc.nextInt();

		int res = findLeftIndex(arr, x);

		System.out.println(res);

		sc.close();
	}

	private static int findLeftIndex(int[] arr, int x) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (x > arr[mid])
				low = mid + 1;
			else if (x < arr[mid])
				high = mid - 1;
			else {
				if (mid == 0 || arr[mid - 1] != arr[mid])
					return mid;
				else
					high = mid - 1;
			}
		}

		return -1;
	}

}
