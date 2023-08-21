package com.dsa.course.bit.problems;

import java.util.Scanner;

public class FirstSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = firstSetBit(n);

		System.out.println(res);

		sc.close();
	}
	
	private static int firstSetBit(int n) {
		return (int) (Math.log10((n ^ (n - 1)) + 1) / Math.log10(2));
	}


}
