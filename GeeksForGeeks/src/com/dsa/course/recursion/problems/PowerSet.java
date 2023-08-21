package com.dsa.course.recursion.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PowerSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		ArrayList<String> strSet = powerSet(str);
		
		System.out.println(strSet);

		sc.close();
	}

	private static ArrayList<String> powerSet(String str) {
		ArrayList<String> strSet = new ArrayList<>();
		sub(strSet, str, "", 0);
		Collections.sort(strSet);
		return strSet;
	}

	private static void sub(ArrayList<String> strSet, String str, String curr, int i) {
		if (i == str.length()) {
			strSet.add(curr);
			return;
		}
		
		sub(strSet, str, curr, i + 1);
		sub(strSet, str, curr + str.charAt(i), i + 1);
	}

}
