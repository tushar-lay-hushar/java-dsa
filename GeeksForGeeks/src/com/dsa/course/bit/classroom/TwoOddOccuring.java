package com.dsa.course.bit.classroom;

import java.util.Scanner;

public class TwoOddOccuring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		findTwoOddOccuring(arr);

		sc.close();
	}
	
	private static void findTwoOddOccuring(int arr[]) {
		
		int arrXor = 0;
		for (int i = 0; i < arr.length; i++)
			arrXor = arrXor ^ arr[i];
		
		int setBit = arrXor & ~(arrXor - 1);
		
		int res1 = 0;
		int res2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if((arr[i] & setBit) != 0)
				res1 = res1 ^ arr[i];
			else
				res2 = res2 ^ arr[i];
		}
		
		System.out.println(res1);
		System.out.println(res2);
	}

}
