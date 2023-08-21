package com.dsa.course.hashing.problems;

import java.util.Arrays;

public class LinearProbing {

	public static void main(String[] args) {

		int[] arr = { 4, 14, 24, 44 };
		System.out.println(linearProbing(10, arr, arr.length));

	}

	private static int[] linearProbing(int hashSize, int[] arr, int n) {

		int[] table = new int[hashSize];
		Arrays.fill(table, -1);
		int size = 0;
		
		for (int key : arr) {
			if (size >= hashSize)
				break;
			
			int hash = key % hashSize;
			int i = hash;
			while (table[i] != -1 && table[i] != key) {
				i = (i + 1) % hashSize;
			}
			if (table[i] != key) {
				table[i] = key;
				size++;
			}
		}

		return table;
	}

}
