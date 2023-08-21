package com.dsa.course.bit.problems;

import java.util.Scanner;

public class GreyToBinaryCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = greyToBinaryConverter(n);

		System.out.println(res);

		sc.close();
	}

	private static int greyToBinaryConverter(int n) {
		int res = 0;
		while (n > 0) {
			res = res ^ n;
			n = n >> 1;
		}
		return res;
	}
}
