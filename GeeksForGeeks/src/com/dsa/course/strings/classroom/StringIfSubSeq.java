package com.dsa.course.strings.classroom;

public class StringIfSubSeq {

	public static void main(String[] args) {
		
		String s1 = "ABABCDEF";
		String s2 = "ABC";
		
		System.out.println(isSubSeq(s1, s2));

	}

	private static boolean isSubSeq(String s1, String s2) {
		
		int  pos = 0;
		for (char ch : s1.toCharArray()) {
			if (s2.charAt(pos) == ch) {
				if (pos == s2.length() - 1)
					return true;
			}
			else
				pos = 0;
			pos++;
		}
		
		return false;
	}

}
