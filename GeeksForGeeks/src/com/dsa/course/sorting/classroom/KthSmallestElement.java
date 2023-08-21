package com.dsa.course.sorting.classroom;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int k = sc.nextInt();

		int p = kthSmallest(arr, 0, arr.length - 1, k);

		System.out.println(Arrays.toString(arr));
		
		System.out.println(p);

		sc.close();
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = (start - 1);

		for(int j = start; j <= end - 1; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr, i, end);
		return i;
	}

	private static int kthSmallest(int[] arr, int start, int end, int k) {
		while (start <= end) {
			int p = partition(arr, start, end);
			if (p == k - 1)
				return arr[p];
			else if (p > k - 1)
				end = p - 1;
			else
				start = p + 1;
		}
		return -1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
