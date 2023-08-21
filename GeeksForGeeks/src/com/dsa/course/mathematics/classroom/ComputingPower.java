package com.dsa.course.mathematics.classroom;

import java.util.Scanner;

public class ComputingPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int pow = sc.nextInt();

		int res = computePowerEff(n, pow);

		System.out.println(res);

		sc.close();
	}

	private static int computePower(int n, int pow) {

		if (pow == 0)
			return 1;

		int temp = computePower(n, pow/2);

		temp = temp * temp;

		if (pow % 2 == 0)
			return temp;
		else
			return temp * n;
	}

	private static int computePowerEff(int n, int pow) {

		int res = 1;
		
		while (pow > 0) {
			if (pow % 2 != 0)
				res = res * n;
			n = n * n;
			pow = pow / 2;
		}
		
		return res;
	}
}
