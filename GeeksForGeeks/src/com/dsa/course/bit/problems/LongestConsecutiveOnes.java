package com.dsa.course.bit.problems;

import java.util.Scanner;

public class LongestConsecutiveOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = findLCO(n);

		System.out.println(res);

		sc.close();
	}

	private static int findLCO(int n) {

		int count = 0;
		while (n != 0) {
			n = (n & (n >> 1));
			count++;
		}
		return count;
	}

}
