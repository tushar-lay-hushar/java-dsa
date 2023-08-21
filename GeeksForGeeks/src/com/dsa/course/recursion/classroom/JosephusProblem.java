package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int res = josProb(n, k);
		
		System.out.println(res);

		sc.close();
	}

	private static int josProb(int n, int k) {
		if (n == 1)
			return 0;
		return (josProb(n - 1, k) + k) % n;
	}

}
