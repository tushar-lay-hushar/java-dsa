package com.dsa.course.tree.classroom;

public class Height {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.right.left = new Node(40);
        head.right.right = new Node(50);

        System.out.println(height(head));
    }

    private static int height(Node node) {
        if (node == null)
            return 0;
        else
            return Math.max(height(node.left), height(node.right)) + 1;
    }
}
