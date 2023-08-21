package com.dsa.course.arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeAlternately {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		rearrange(arr, arr.length);

		System.out.println(Arrays.toString(arr));

		sc.close();
	}
	
	private static void rearrange(int[] arr, int n) {
		int l = 0;
		int r = n - 1;
		int i = 0;
		int max = arr[r] + 1;
		
		while (l <= r){
			if (i % 2 == 0){
				arr[i] += arr[r] % max * max;
				r--;
			}
			else{
				arr[i] += arr[l] % max * max;
				l++;
			}
			i++;
		}      
		for (int j = 0; j < n; j++)
			arr[j] /= max;
	}
	
	
//	private static void rearrange(int[] arr, int n) {
//		int temp = 0;
//		for(int i = 0 , j = n - 1; i < j; i = i + 2, j--) {
//			temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
//		
//		for (int i = 1; i < n - 1; i += 2) {
//			for (int j = i, k = n - 1; j < k; j +=2, k--) {
//				temp = arr[j];
//				arr[j] = arr[k];
//				arr[k] = temp;
//			}
//		}
//	}
	
	
//	private static void rearrange(int[] arr, int n) {
//		int mul = (int) Math.pow(10, (int) Math.log10(arr[n - 1]) + 1);
//		
//		System.out.println(mul);
//		
//		int l = 0;
//		int r = n - 1;
//		int i = 0;
//		
//		while (l <= r) {
//			if (i % 2 == 0) {
//				arr[i] = (arr[i] * mul) + arr[r];
//				r--;
//			}
//			else {
//				arr[i] = (arr[l]/ mul) + (arr[i] * mul);
//				l++;
//			}
//			i++;
//			System.out.println(Arrays.toString(arr));
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		for (int j = 0; j < n; j++)
//			arr[j] %= mul;
//	}

}
