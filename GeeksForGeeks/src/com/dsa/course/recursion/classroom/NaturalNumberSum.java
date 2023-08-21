package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = sumOfNos(n);
		
		System.out.println(res);

		sc.close();
	}

	private static int sumOfNos(int n) {
		if (n == 1)
			return 1;
		return n + sumOfNos(n - 1);
	}

}
