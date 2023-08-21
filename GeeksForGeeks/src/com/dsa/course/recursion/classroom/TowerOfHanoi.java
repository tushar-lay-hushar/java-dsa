package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		printTOHSol(n, 'A', 'B', 'C');

		sc.close();
	}

	private static void printTOHSol(int n, char a, char b, char c) {
		if (n == 1) {
			System.out.println("Move " + n + " from " + a + " to " + c);
			return;
		}
		printTOHSol(n - 1, a, c, b);
		System.out.println("Move " + n + " from " + a + " to " + c);
		printTOHSol(n - 1, b, a, c);
	}

}
