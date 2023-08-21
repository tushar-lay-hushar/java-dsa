package com.dsa.course.bit.classroom;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean res = checkPowerOfTwo(n);

		System.out.println(res);

		sc.close();
	}
	
	private static boolean checkPowerOfTwo(int n) {
		
		if((n & (n - 1)) == 0)
			return true;
		return false;
	}

}
