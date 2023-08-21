package com.dsa.course.bit.problems;

import java.util.Scanner;

public class BinaryToGreyCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = binaryToGreyConverter(n);

		System.out.println(res);

		sc.close();
	}

	private static int binaryToGreyConverter(int n) {
		return (n ^ (n >> 1));
	}
}
