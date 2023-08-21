package com.dsa.course.arrays.problems;

import java.util.Scanner;

public class MaxOccuredInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] lArr = new int[n];
		int[] rArr = new int[n];

		for (int i = 0; i < n; i++)
			lArr[i] = sc.nextInt();
		
		for (int i = 0; i < n; i++)
			rArr[i] = sc.nextInt();
		
		int maxx = 0;
		for (int i = 0; i < rArr.length; i++)
			maxx = rArr[i] > maxx ? rArr[i] : maxx;

		int res = maxOccured(lArr, rArr, maxx);

		System.out.println(res);

		sc.close();
	}

	private static int maxOccured(int[] lArr, int[] rArr, int maxx) {
		
		int[] arr = new int[maxx + 1];
		
		for (int i = 0; i < arr.length; i++) {
			arr[lArr[i]]++;
			arr[rArr[i] + 1]--;
		}
		
		int maxOccured = arr[0];
		int res = 0;
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
			if (maxOccured < arr[i]) {
				maxOccured = arr[i];
				res = i;
			}
		}
		
		return res;
	}

}
