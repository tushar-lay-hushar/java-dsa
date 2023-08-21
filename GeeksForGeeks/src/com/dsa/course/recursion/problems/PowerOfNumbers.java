package com.dsa.course.recursion.problems;

import java.util.Scanner;

public class PowerOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		long res = power(n, k);

		System.out.println(res);

		sc.close();
	}

	private static long power(int n, int k) {
		return k > 0 ? (long) ((n * power(n, k - 1)) % 1000000007l) : 1l;
	}
}
