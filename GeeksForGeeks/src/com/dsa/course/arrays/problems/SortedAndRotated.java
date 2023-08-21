package com.dsa.course.arrays.problems;

import java.util.Scanner;

public class SortedAndRotated {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		boolean res = checkRotatedAndSorted(arr, arr.length);

		System.out.println(res);

		sc.close();
	}

	public static boolean checkRotatedAndSorted(int arr[], int num){

		int index = 0;
        int count = 0;
        while(index < num - 1) {
            if(arr[index] > arr[index + 1])
                count++;
            else 
            	count--;
            index++;
        }
        
        System.out.println(count);
        
        if((num - Math.abs(count)) == 2)
            return true;
            
        return false;
	}

}
