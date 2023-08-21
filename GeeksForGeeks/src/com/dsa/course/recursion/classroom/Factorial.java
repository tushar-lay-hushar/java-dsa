package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = factorial(n);
		
		System.out.println(res);

		sc.close();
	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

}
