package com.dsa.course.hashing.classroom;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
	
	int BUCKET;
	
	ArrayList<LinkedList<Integer>> table;
	
	void insert (int key) {
		int i = key % BUCKET;
		table.get(i).add(key);
	}
	
	void remove(int key) {
		int i = key % BUCKET;
		table.get(i).remove((Integer) i);
	}
	
	boolean search(int key) {
		int i = key % BUCKET;
		return table.get(i).contains(key);
	}

}
