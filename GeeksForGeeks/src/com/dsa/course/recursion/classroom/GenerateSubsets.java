package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class GenerateSubsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		printSubsets(str, "", 0);

		sc.close();
	}

	private static void printSubsets(String str, String curr, int i) {
		if (i == str.length()) {
			System.out.println(curr + " ");
			return;
		}
		
		printSubsets(str, curr, i + 1);
		printSubsets(str, curr + str.charAt(i), i + 1);
	}

}
