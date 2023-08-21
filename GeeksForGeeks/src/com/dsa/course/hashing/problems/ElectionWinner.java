package com.dsa.course.hashing.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElectionWinner {

	public static void main(String[] args) {

		String[] votes = {"john", "johnny", "jackie",
				"johnny", "john", "jackie", "jamie", "jamie",
				"john", "johnny", "jamie", "johnny", "john" };

		System.out.println(Arrays.asList(winner(votes)));

	}

	private static String[] winner(String[] arr) {

		Map<String, Integer> voteCount = new HashMap<>();

		for (String vote : arr) {
			voteCount.computeIfPresent(vote, (key, oldValue) -> ++oldValue);
			voteCount.computeIfAbsent(vote, key -> 1);
		}

		String winnerName = arr[0];
		Integer count = 0;

		for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
			if (entry.getValue() > count || (entry.getValue().equals(count) && entry.getKey().compareTo(winnerName) < 0)) {
				winnerName = entry.getKey();
				count = entry.getValue();
			}
		}

		return new String[] {winnerName, count.toString()};
	}

}
