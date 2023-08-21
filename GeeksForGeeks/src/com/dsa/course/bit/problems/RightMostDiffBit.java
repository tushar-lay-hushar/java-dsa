package com.dsa.course.bit.problems;

import java.util.Scanner;

public class RightMostDiffBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int res = findRMDBit(m, n);

		System.out.println(res);

		sc.close();
	}
	
	private static int findRMDBit(int m, int n) {
		return (m == n) ? -1 : (int) (Math.log10((m ^ n) & (~((m ^ n) - 1))) / Math.log10(2)) + 1;
	}

}
