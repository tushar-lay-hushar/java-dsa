package com.dsa.course.bit.classroom;

import java.util.Scanner;

public class OneOddOccuring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res = findOneOddOccuring(arr);

		System.out.println(res);

		sc.close();
	}
	
	private static int findOneOddOccuring(int arr[]) {
		
		int arrXor = 0;
		int countXor = 0;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			arrXor = arrXor ^ arr[i];
			countXor = countXor ^ (i + 1);
		}
		
		countXor = countXor ^ (i + 1);
		
		return countXor ^ arrXor;
	}

}
