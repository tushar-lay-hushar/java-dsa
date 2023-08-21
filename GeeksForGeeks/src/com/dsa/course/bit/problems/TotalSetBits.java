package com.dsa.course.bit.problems;

import java.util.Scanner;

public class TotalSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = countSetBits(n);

		System.out.println(res);

		sc.close();
	}

	private static int countSetBits(int n) {
		double res = 0;
		while (n > 0) {
			if (n % 2 == 0)
				res += n;
			res += (n + 1); 
			n >>= 1;
		}
		return (int) res;
	}
}
