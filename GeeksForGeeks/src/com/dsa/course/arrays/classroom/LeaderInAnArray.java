package com.dsa.course.arrays.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		ArrayList<Integer> res = printLeader(arr);
		
		System.out.println(res);

		sc.close();
	}

	private static ArrayList<Integer> printLeader(int[] arr) {
		Integer curr = -1;
		ArrayList<Integer> leaders = new ArrayList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > curr) {
				curr = arr[i];
				leaders.add(curr);
			}
		}
		
		Collections.sort(leaders, (Integer a, Integer b) -> {return b - a;});
		return leaders;
	}

}
