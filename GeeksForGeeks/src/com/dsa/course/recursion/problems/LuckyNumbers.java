package com.dsa.course.recursion.problems;

import java.util.Scanner;

public class LuckyNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean res = isLucky(n);

		System.out.println(res);

		sc.close();
	}
	
	static int c = 2;

	private static boolean isLucky(int n) {
		if (c > n) {
			c = 2;
			return true;
		}
		
		if (n % c == 0) {
			c = 2;
			return false;
		}
		
		n -= n / c;
		c++;
		return isLucky(n);
	}

}
