package com.dsa.course.bst.classroom;

public class Node {
    int data;
    Node left;
    Node right;

    public Node() { }

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }
}
