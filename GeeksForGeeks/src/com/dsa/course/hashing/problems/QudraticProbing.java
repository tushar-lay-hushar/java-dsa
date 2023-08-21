package com.dsa.course.hashing.problems;

import java.util.Arrays;

public class QudraticProbing {

	public static void main(String[] args) {

//		int[] arr = { 21, 10, 32, 43 };
		int[] arr = { 825, 156, 343, 938, 138, 441, 566, 32, 915, 934, 634, 417, 861, 235, 156, 240, 956, 286, 402, 295, 237, 143, 425, 535, 327, 997, 456, 996 };
		int hashSize = 67;
		int[] hash = new int[hashSize];
		quadraticProbing(hash, hashSize, arr, arr.length);
		System.out.println(Arrays.toString(hash));

	}

	private static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {

		Arrays.fill(hash, -1);
		int size = 0;
		
		for (int key : arr) {
			if (size >= hash_size)
				break;
			
			int h = key % hash_size;
			int i = 1;
			while (hash[h] != -1) {
				h = (key + (i * i)) % hash_size;
				i++;
			}
			if (hash[h] != key) {
				hash[h] = key;
				size++;
			}
		}
	}

}
