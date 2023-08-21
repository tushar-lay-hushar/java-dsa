package com.dsa.course.bit.classroom;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = countBits(n);

		System.out.println(res);

		sc.close();
	}
	
	private static int countBits(int n) {
		int res = 0;
		
		while (n > 0) {
			n = (n & (n - 1));
			res++;
		}
		return res;
	}
	
	private static int countBitsLog(int n) {
		return (int) (Math.log10(n) / Math.log10(2));
	}

}
