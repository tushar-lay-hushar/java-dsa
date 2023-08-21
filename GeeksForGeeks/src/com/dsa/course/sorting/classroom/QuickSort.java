package com.dsa.course.sorting.classroom;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		quickSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

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

	private static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int p = partition(arr, start, end);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
