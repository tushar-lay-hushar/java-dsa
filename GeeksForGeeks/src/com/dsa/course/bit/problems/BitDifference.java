package com.dsa.course.bit.problems;

import java.util.Scanner;

public class BitDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int res = countBitDifference(m, n);

		System.out.println(res);

		sc.close();
	}

	private static int countBitDifference(int a, int b) {
		
		if (a == 0 && b == 0)
			return 0;
		
		int xor = a ^ b;
		int count = 0;
		
		while (xor > 0) {
			count++;
			xor = (xor &(xor - 1));
		}
			
		return count;
	}
}
