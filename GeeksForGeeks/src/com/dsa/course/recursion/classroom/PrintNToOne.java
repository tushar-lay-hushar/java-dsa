package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class PrintNToOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		printNtoOne(n);

		sc.close();
	}

	private static void printNtoOne(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printNtoOne(n - 1);
	}

}
