package com.dsa.course.strings.classroom;

public class StringAnagram {
	
	private static final int CHAR = 256;

	public static void main(String[] args) {
		
		String s1 = "ABCDEF";
		String s2 = "FEDCBA";
		
		System.out.println(areAnagrams(s1, s2));

	}

	private static boolean areAnagrams(String s1, String s2) {
		
		if (s1.length() != s2.length())
			return false;
		
		int[] countArr = new int[CHAR];
		
		for (int i = 0; i < s1.length(); i++) {
			++countArr[s1.charAt(i)];
			--countArr[s2.charAt(i)];
		}
		
		for (int count : countArr) {
			if (count != 0)
				return false;
		}
		
		return true;
	}

}
