package com.dsa.course.bit.classroom;

import java.util.Scanner;

public class KthBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		boolean res = checkKthBitRS(n, k);

		System.out.println(res);

		sc.close();
	}

	private static boolean checkKthBitLS(int n, int k) {

		if ((n & (1 << (k - 1))) != 0)
			return true;
		return false;
	}

	private static boolean checkKthBitRS(int n, int k) {

		if ((1 & (n >> (k - 1))) != 0)
			return true;
		return false;
	}
}
