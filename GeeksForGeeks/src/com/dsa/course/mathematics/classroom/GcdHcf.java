package com.dsa.course.mathematics.classroom;

import java.util.Scanner;

public class GcdHcf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int res = findGcdHcfEff(a, b);

		System.out.println(res);

		sc.close();
	}

	private static int findGcdHcf(int a, int b) {

		while(a != b) {
			if(a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	private static int findGcdHcfEff(int a, int b) {

		if (b == 0)
			return a;
		else
			return findGcdHcfEff(b, a % b);
	}

}
