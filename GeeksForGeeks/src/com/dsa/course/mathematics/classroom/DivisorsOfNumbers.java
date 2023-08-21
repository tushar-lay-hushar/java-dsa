package com.dsa.course.mathematics.classroom;

import java.util.Scanner;

public class DivisorsOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		printAllDivisors(n);

		sc.close();
	}
	
	private static void printAllDivisors(int n) {
		if (n < 0)
			return;
		
		int i;
		for (i = 1; i * i < n; i++)
			if (n % i == 0)
				System.out.println(i);
		for( ; i >= 1; i--)
			if (n % i == 0)
				System.out.println(n/i);
	}

}
