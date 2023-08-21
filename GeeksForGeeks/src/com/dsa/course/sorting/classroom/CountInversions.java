package com.dsa.course.sorting.classroom;

import java.util.Scanner;

public class CountInversions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = countInversions(arr, 0, arr.length - 1);

		System.out.println(res);

		sc.close();
	}

	private static int countInversions(int[] arr, int left, int right) {
		int res = 0;
		if(left < right) {
			int mid = left + (right - left)/2;
			res += countInversions(arr, left, mid);
			res += countInversions(arr, mid, right);
			res += countAndMerge(arr, left, mid, right);
		}
		return res;
	}

	private static int countAndMerge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		for(int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
		for(int i = 0; i < n2; i++) rightArr[i] = arr[mid + i + 1];
		
		int res = 0;
		int i = 0;
		int j = 0;
		int k = left;
		
		while (i < n1 && j < n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}
			else {
				arr[k] = rightArr[j];
				res += res + (n1 - i);
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
		return res;
	}

}
