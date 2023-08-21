package com.dsa.course.arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] arr = new long[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		arrange(arr, arr.length);

		System.out.println(Arrays.toString(arr));

		sc.close();
	}

	private static void arrange(long[] arr, int n) {
		int mul = (int) Math.pow(10, (int) Math.log10(n - 1) + 1);
		for (int i = 0; i < n; i++) {
			if(arr[(int) arr[i]] < mul)
				arr[i] = (arr[(int) arr[i]] * mul) + arr[i];
			else
				arr[i] += (arr[(int) arr[i]] % mul) * mul;
		}

		for(int i = 0; i < n; i++)
			arr[i] /= mul;
	}
	
//	private static void arrange(long[] arr, int n) {
//		for (int i = 0; i < n; i++)
//			arr[i] += (arr[(int) arr[i]] % n) * n;
//		
//		for (int i = 0; i < n; i++)
//			arr[i] /= n;
//	}
}
