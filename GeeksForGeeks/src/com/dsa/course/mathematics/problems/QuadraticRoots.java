package com.dsa.course.mathematics.problems;

import java.util.*;

public class QuadraticRoots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			QuadraticRootsSolution obj = new QuadraticRootsSolution();
			ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
			if (ans.size() == 1 && ans.get(0) == -1)
				System.out.print("Imaginary");
			else
				for (Integer val : ans) System.out.print(val + " ");
			System.out.println();
		}
		sc.close();
	}
}

class QuadraticRootsSolution 
{
	public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		ArrayList<Integer> roots = new ArrayList<>();
		double det = Math.pow(b,2) - 4 * a * c;
		if (det < 0)
			roots.add(-1);
		else if (det == 0) {
			double root = Math.floor(-b / (2 * a));
			roots.add((int) root);
			roots.add((int) root);
		}
		else {
			double root1 = (int) Math.floor((-b + Math.sqrt(det)) / (2 * a));
			double root2 = (int) Math.floor((-b - Math.sqrt(det)) / (2 * a));
			if (root1 > root2) {
				roots.add((int) root1);
				roots.add((int) root2);
			} else {
				roots.add((int) root2);
				roots.add((int) root1);
			}
		}
		return roots;
	}
}