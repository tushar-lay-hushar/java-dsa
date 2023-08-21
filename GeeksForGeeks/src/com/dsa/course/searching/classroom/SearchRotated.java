package com.dsa.course.searching.classroom;

import java.util.Scanner;

public class SearchRotated {

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
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] == ele) return mid;
			
			if (arr[low] < arr[mid]) {
				if (ele >= arr[low] && ele <= arr[mid])
					high = mid - 1;
				else
					high = mid + 1;
			}
			else {
				if (ele > arr[mid] && ele <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		
		return -1;
	}
}
