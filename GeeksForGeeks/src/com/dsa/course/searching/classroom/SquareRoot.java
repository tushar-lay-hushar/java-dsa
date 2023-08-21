package com.dsa.course.searching.classroom;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = sqrRoot(n);

		System.out.println(res);

		sc.close();
	}

	private static int sqrRoot(int n) {
		int low = 1;
		int high = n;
		int res = -1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			int midSqr = mid * mid;
			if (midSqr == n)
				return mid;
			else if (midSqr > n)
				high = mid - 1;
			else {
				low = mid + 1;
				res = mid;
			}
		}
		
		return res;
	}
}
