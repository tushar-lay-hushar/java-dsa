package com.dsa.course.tree.classroom;

public class CovertToDLL {
    public static void main(String[] args) {

    }

    Node prev = null;

    Node convertToDll(Node node) {
        if (node == null)
            return null;

        Node head = convertToDll(node.left);

        if (prev == null)
            head = node;
        else {
            node.left = prev;
            prev.right = node;
        }
        prev = node;
        convertToDll(node.right);
        return node;
    }

}
