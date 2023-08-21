package com.dsa.course.tree.classroom;

public class PrintKDistance {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(40);
        head.left.right = new Node(50);
        head.right.right = new Node(70);

        Node temp = new Node(10);
        temp.left = new Node(6);
        temp.right = new Node(8);
        temp.right.right = new Node(7);
        temp.right.right.left = new Node(11);
        temp.right.right.right = new Node(12);

        print(head, 2);
        System.out.println();
        print(temp, 3);
    }

    private static void print(Node node, int k) {
        if (node == null)
            return;
        if (k == 0) {
            System.out.print(node.data + " ");
        }
        else {
            print(node.left, k - 1);
            print(node.right, k - 1);
        }
    }
}
