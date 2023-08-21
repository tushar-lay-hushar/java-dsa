package com.dsa.course.bit.problems;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean res = checkPowerOfTwo(n);

		System.out.println(res);

		sc.close();
	}

	private static boolean checkPowerOfTwo(int n) {
		return n > 0 ? (n & (n - 1)) == 0 : false;
	}
}
