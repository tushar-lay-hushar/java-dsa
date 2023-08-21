package com.dsa.course.arrays.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++)
			arr.add(sc.nextInt()); 
		
		int k = sc.nextInt();

		reverseGroups(arr, k);
		
		System.out.println(arr);

		sc.close();
	}

	private static void reverseGroups(ArrayList<Integer> arr, int k) {
		for (int i = 0; i < arr.size(); i = i + k) {
			int end = i + (k - 1);
			if (end >= arr.size())
				end = arr.size() - 1;
			
			for (int j = i; j < end; j++, end--) {
				swap(arr, j, end);
			}
		}
		
	}

	private static void swap(ArrayList<Integer> arr, int i, int j) {
		int temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);
	}

}
