package com.dsa.course.arrays.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxAndSecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		ArrayList<Integer> maxNumbers = maxAndSecondMax(arr);
		
		System.out.println(maxNumbers);

		sc.close();
	}

	private static ArrayList<Integer> maxAndSecondMax(int[] arr) {
		int firstMax = -1;
		int secondMax = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}
			else if (arr[i] > secondMax && arr[i] < firstMax)
				secondMax = arr[i];
		}
		ArrayList<Integer> maxNumbers = new ArrayList<>();
		maxNumbers.add(firstMax);
		maxNumbers.add(secondMax);
		return maxNumbers;
	}

}
