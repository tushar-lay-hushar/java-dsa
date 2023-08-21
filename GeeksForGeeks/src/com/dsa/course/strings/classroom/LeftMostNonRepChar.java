package com.dsa.course.strings.classroom;

import java.util.Arrays;

public class LeftMostNonRepChar {
	
	private static final int CHAR = 256;

	public static void main(String[] args) {
		
		String s1 = "AABCDDEF";

		System.out.println(findRepChar(s1));
		
	}
	
	private static int findRepChar(String s1) {

		int[] charCount = new int[CHAR];
		Arrays.fill(charCount, -1);
		
		for (int i = 0; i < s1.length(); i++) {
			if (charCount[s1.charAt(i)] == -1)
				charCount[s1.charAt(i)] = i;
			else
				charCount[s1.charAt(i)] = -2;
		}
		
		int res = Integer.MAX_VALUE;

		for (int num : charCount)
			if (num >= 0)
				res = Math.min(res, num);
		
		return res == Integer.MAX_VALUE ? -1 : res;
	}

}
