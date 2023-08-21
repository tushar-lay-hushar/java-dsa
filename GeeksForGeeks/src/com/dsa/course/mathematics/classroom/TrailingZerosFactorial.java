package com.dsa.course.mathematics.classroom;
import java.util.Scanner;

public class TrailingZerosFactorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int res = countTrailingZeros(n);
		
		System.out.println(res);
		
		sc.close();

	}
	
	private static int countTrailingZeros(int n) {
		int res = 0;
		
		for (int i = 5; i <= n; i = i * 5) {
			res = res + n / i;
		}
		
		return res;
	}

}
