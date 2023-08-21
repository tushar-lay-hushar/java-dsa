package com.dsa.course.tree.classroom;

public class MaxOfTree {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.right.left = new Node(40);
        head.right.right = new Node(50);

        System.out.println(maxOfTree(head));
    }

    private static int maxOfTree(Node node) {
        if (node == null)
            return -1;
        return Math.max(node.data, Math.max(maxOfTree(node.left), maxOfTree(node.right)));
    }
}
