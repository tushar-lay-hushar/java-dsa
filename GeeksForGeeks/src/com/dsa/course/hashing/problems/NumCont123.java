package com.dsa.course.hashing.problems;

import java.util.HashMap;

public class NumCont123 {
	
	static HashMap<Integer, Integer> mp = new HashMap<>();

	public static void main(String[] args) {
		
		for(int i =0;i<1000001;i++)
	    {
	        if(check(i)==true)
	        {
	        mp.put(i,1);
	        }
	    }
	}
	
	static boolean check(int n) {
	    while(n>0)
	    {
	        int key = n%10;
	        if(key==0 || key>=4)
	        {
	            return false;
	        }
	        n =n/10;
	    }
	    return true;
	}

}
