package com.dsa.course.arrays.classroom;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int newSize = moveZeros(arr);

		System.out.println(newSize);
		
		System.out.println(Arrays.toString(arr));

		sc.close();
	}

	private static int moveZeros(int[] arr) {
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
			
		return index;
	}

}
