package com.dsa.course.bit.classroom;

import java.util.Scanner;

public class PowerSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		printPowerSet(str);

		sc.close();
	}
	
	private static void printPowerSet(String str) {
		
		int n = str.length();
		
		int powSetSize = (int) Math.pow(2, n);
		
		for (int counter = 0; counter < powSetSize; counter++) {
			for(int j = 0; j < n; j++) {
				if((counter & (1 << j)) != 0)
					System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
	}

}
