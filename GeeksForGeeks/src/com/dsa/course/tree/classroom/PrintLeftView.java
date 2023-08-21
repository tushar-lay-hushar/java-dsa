package com.dsa.course.tree.classroom;

public class PrintLeftView {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.right.left = new Node(40);
        head.right.right = new Node(50);

        printleft(head, 1);
    }

    static int maxLevel = 0;
    private static void printleft(Node node, int level) {
        if (node == null)
            return;

        if (maxLevel < level) {
            System.out.print(node.data + " ");
            maxLevel = level;
        }

        printleft(node.left, level + 1);
        printleft(node.right, level + 1);
    }
}
