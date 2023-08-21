package com.dsa.course.searching.classroom;

import java.util.Scanner;

public class Count1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = count(arr);

		System.out.println(res);

		sc.close();
	}

	private static int count(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == 0)
				low = mid + 1;
			else {
				if (mid == 0 || arr[mid - 1] == 0)
					return (arr.length - mid);
				else
					high = mid - 1;
			}
		}
		
		return 0;
	}
}
