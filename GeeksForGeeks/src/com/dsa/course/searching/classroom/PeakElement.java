package com.dsa.course.searching.classroom;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = getPeak(arr);

		System.out.println(res);

		sc.close();
	}

	private static int getPeak(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= mid))
				return mid;
			if(mid > 0 && arr[mid - 1] >= arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}
