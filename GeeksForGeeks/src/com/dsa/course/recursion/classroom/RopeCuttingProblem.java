package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int res = maxPieces(n, a, b, c);
		
		System.out.println(res);

		sc.close();
	}

	private static int maxPieces(int n, int a, int b, int c) {
		if (n == 0) return 0;
		if (n < 0) return -1;
		
		int res = maxNumber(maxPieces(n - a, a, b, c), 
					maxPieces(n - b, a, b, c),
					maxPieces(n - c, a, b, c));
		
		if (res == -1)
			return -1;
		
		return res + 1;
	}
	
	private static int maxNumber(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > c)
			return b;
		else 
			return c;
	}

}
