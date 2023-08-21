package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = sumOfDigits(n);
		
		System.out.println(res);

		sc.close();
	}

	private static int sumOfDigits(int n) {
		return (n % 10) + (n / 10 < 10 ? n / 10 : sumOfDigits(n / 10));
	}

}
