package com.dsa.course.arrays.classroom;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int newSize = removeDups(arr);

		System.out.println(newSize);
		
		System.out.println(Arrays.toString(arr));

		sc.close();
	}

	private static int removeDups(int[] arr) {
		
		int res = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}

}
