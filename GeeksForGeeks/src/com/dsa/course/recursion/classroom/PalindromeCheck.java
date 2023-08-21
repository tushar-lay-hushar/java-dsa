package com.dsa.course.recursion.classroom;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		boolean res = isPalindrome(str, 0, str.length() - 1);
		
		System.out.println(res);

		sc.close();
	}

	private static boolean isPalindrome(String str, int start, int end) {
		if (start >= end)
			return true;
		return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1);
	}

}
