package com.dsa.course.strings.classroom;

import java.util.HashMap;
import java.util.Map;

public class LeftMostRepChar {
	
	private static final int CHAR = 256;

	public static void main(String[] args) {

		String s1 = "ABCDDEF";

		System.out.println(findRepChar(s1));
		System.out.println(findRepChar2(s1));
		System.out.println(findRepChar3(s1));

	}

	private static int findRepChar(String s1) {

		Map<Character, Integer> charCount = new HashMap<>();

		for (char ch : s1.toCharArray()) {
			charCount.computeIfPresent(ch, (key, oldValue) -> ++oldValue);
			charCount.computeIfAbsent(ch, key -> 1);
		}

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 1)
				return s1.indexOf(entry.getKey());
		}
		return -1;
	}

	private static int findRepChar2(String s1) {

		int[] charCount = new int[CHAR];

		for (char ch : s1.toCharArray())
			++charCount[ch];

		for (char ch : s1.toCharArray()) {
			if(charCount[ch] > 1)
				return s1.indexOf(ch);
		}
		
		return -1;
	}
	
	private static int findRepChar3(String s1) {

		boolean[] visited = new boolean[CHAR];
		
		int res = -1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (visited[s1.charAt(i)])
				res = i;
			else
				visited[s1.charAt(i)] = true;
		}
		
		return res;
	}

}
