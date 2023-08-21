package com.dsa.course.searching.problems;

import java.util.Scanner;

public class MinRotatedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = findMin(arr);

		System.out.println(res);

		sc.close();
	}

	private static int findMin(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			System.out.println(mid);
			if (mid > 0 && arr[mid - 1] > arr[mid])
				return arr[mid];
			else if (arr[mid] > arr[high])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return arr[0];
	}

}
