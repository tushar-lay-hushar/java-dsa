package com.dsa.course.tree.classroom;

public class SizeBinaryTree {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.right.left = new Node(40);
        head.right.right = new Node(50);

        System.out.println(sizeOfTree(head));
    }

    private static int sizeOfTree(Node node) {
        if (node == null) {
            return 0;
        }

        return sizeOfTree(node.left) + sizeOfTree(node.right) + 1;
    }
}
