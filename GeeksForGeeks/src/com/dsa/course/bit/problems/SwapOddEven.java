package com.dsa.course.bit.problems;

import java.util.Scanner;

public class SwapOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = swapOddEvenBits(n);

		System.out.println(res);

		sc.close();
	}

	private static int swapOddEvenBits(int n) {
		return ((n & 715827882) >> 1 | (n & 1431655765) << 1);
	}
}
