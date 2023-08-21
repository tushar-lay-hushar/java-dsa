package com.dsa.course.mathematics.classroom;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int res = findLcm(a, b);

		System.out.println(res);

		sc.close();

	}
	
	private static int findLcm(int a, int b) {
		return (a * b) / findGcdHcfEff(a, b);
	}
	
	private static int findGcdHcfEff(int a, int b) {

		if (b == 0)
			return a;
		else
			return findGcdHcfEff(b, a % b);
	}

}
