package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		printPermutation(str.toCharArray(), 0);

		sc.close();
	}

	private static void printPermutation(char str[], int i) {
		if(i == str.length - 1) {
			System.out.println(new String(str));
			return;
		}
		for (int j = i; j < str.length; j++) {
			swap(str, i, j);
			printPermutation(str, i + 1);
			swap(str, i, j);
		}
	}

	private static void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}
	
	

}
