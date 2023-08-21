package com.dsa.course.recursion.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsFromPhoneNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		ArrayList<String> strSet = possibleWords(arr, n);

		System.out.println(strSet);

		sc.close();
	}

	private static ArrayList <String> possibleWords(int a[], int N) {
		ArrayList<String> possComb = new ArrayList<>();
		sub(possComb, a, "", 0);
		return possComb;
	}
	
	static String[] numChars = new String[] {"", "", "abc", "def" , "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	private static void sub(ArrayList<String> possComb, int[] arr, String curr, int n) {
		
		if (n == arr.length) {
			possComb.add(curr);
			Collections.sort(possComb);
			return;
		}
		
		sub(possComb, arr, curr + Character.toString(numChars[arr[n]].charAt(0)), n + 1);
		sub(possComb, arr, curr + Character.toString(numChars[arr[n]].charAt(1)), n + 1);
		sub(possComb, arr, curr + Character.toString(numChars[arr[n]].charAt(2)), n + 1);
		if (arr[n] == 7 || arr[n] == 9)
			sub(possComb, arr, curr + Character.toString(numChars[arr[n]].charAt(3)), n + 1);
	}
}
