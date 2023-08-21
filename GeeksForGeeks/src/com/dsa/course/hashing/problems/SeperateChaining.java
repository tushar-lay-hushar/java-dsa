package com.dsa.course.hashing.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SeperateChaining {

	public static void main(String[] args) {

		int arr[] = {92,4,14,24,44,91};

		System.out.println(separateChaining(arr, arr.length, 10));

	}

	private static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();

		for(int i=0;i <=hashSize;i++){
			al.add(new ArrayList<>());
		}

		for (int i = 0; i < n; i++){
			int j = arr[i] % hashSize;
			al.get(j).add(arr[i]);
		}

		return al;
	}

	int[] linearProbing(int cap, int arr[], int n)
	{
		//Your code here
		int[] table = new int[cap];
		int size = 0;
		Arrays.fill(table, -1);
		for (int k = 0; k<n; k++) { 
			if (size >= cap) {
				break;
			}
			int h = arr[k]%cap;
			int i = h;
			while (table[i] != -1 && table[i] != arr[k]) {
				i = (i+1) %cap;
			}
			if (table[i] != arr[k]) {
				table[i] = arr[k];
				size++;
			}

		}
		return table;
	}

}
