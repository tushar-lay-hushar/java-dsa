package com.dsa.course.mathematics.problems;

import java.util.Scanner;

public class ExactThreeDivisors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();

		while(T-->0)
		{
			ExactThreeDivisorsSolution obj=new ExactThreeDivisorsSolution();
			int N;
			N=sc.nextInt();//taking N
			//calling function exactly3Divisors()
			System.out.println(obj.exactly3Divisors(N));

		}
		
		sc.close();
	}
}

class ExactThreeDivisorsSolution
{

	public int exactly3Divisors(int N) {
		int numCount = 0;
		for (int i = 1; i <= Math.sqrt(N); i++)
			if(isPrime(i))
				numCount++;
		return numCount;
	}

	private boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i = i + 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;
		return true;
	}
}
