package com.dsa.course.bst.classroom;

public class Ceil {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(5);
        head.right = new Node(15);
        head.right.left = new Node(12);
        head.right.right = new Node(30);

        System.out.println(ceil(head, 14));
    }

    public static Node ceil(Node node, int x) {
        Node res = null;
        while (node != null) {
            if (node.data == x)
                return node;
            else if (node.data < x)
                node = node.right;
            else {
                res = node;
                node = node.left;
            }
        }
        return res;
    }
}
