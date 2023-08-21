package com.dsa.course.searching.classroom;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int ele = sc.nextInt();

		int res = search(arr, ele);

		System.out.println(res);

		sc.close();
	}

	private static int search(int[] arr, int ele) {
		
		int low = 0;
		int high = arr.length - 1;
		int mid  = 0;
		
		while (low < high) {
			mid  = (low + high) / 2;
			if (arr[mid] == ele)
				return mid;
			else if (arr[mid] > ele)
				high = mid - 1;
			else if (arr[mid] < ele)
				low = mid + 1;
		}
		
		return -1;
	}

}
