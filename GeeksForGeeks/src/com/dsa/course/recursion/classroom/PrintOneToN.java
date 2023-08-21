package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class PrintOneToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		printOnetoN(n);

		sc.close();
	}

	private static void printOnetoN(int n) {
		if (n == 0)
			return;
		printOnetoN(n - 1);
		System.out.println(n);
	}

}
