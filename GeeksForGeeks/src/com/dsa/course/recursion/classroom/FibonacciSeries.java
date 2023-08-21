package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = fibonacci(n);
		
		System.out.println(res);

		sc.close();
	}

	private static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n <= 1) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
