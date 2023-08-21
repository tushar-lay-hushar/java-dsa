package com.dsa.course.searching.problems;

import java.util.Scanner;

public class Floor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int x = sc.nextInt();

		int res = findFloor(arr, x);

		System.out.println(res);

		sc.close();
	}
	
	private static int findFloor(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] == x)
				return mid;
			else if(arr[mid] < x && (mid == arr.length - 1 || arr[mid + 1] > x))
				return mid;
			else if(arr[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}
