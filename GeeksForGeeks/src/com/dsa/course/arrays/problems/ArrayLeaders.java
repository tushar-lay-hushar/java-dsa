package com.dsa.course.arrays.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLeaders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		ArrayList<Integer> res = findLeaders(arr);

		System.out.println(res);

		sc.close();
	}

	private static ArrayList<Integer> findLeaders(int[] arr) {
		ArrayList<Integer> leaders = new ArrayList<>();
		int leader = arr[arr.length - 1];
		leaders.add(leader);
		
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
				leaders.add(0, leader);
			}
		}
		return leaders;
	}

}
