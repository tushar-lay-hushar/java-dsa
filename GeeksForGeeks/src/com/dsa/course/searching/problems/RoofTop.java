package com.dsa.course.searching.problems;

import java.util.Scanner;

public class RoofTop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = countRoofTop(arr);

		System.out.println(res);

		sc.close();
	}

	private static int countRoofTop(int[] arr) {
		
		int curr = 0;
		int max = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] < arr[i + 1]) {
				curr++;
				max = curr > max ? curr : max;
			} else
				curr = 0;
		}
		
		return max;
	}

}
