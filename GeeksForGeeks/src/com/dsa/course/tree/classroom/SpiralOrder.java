package com.dsa.course.tree.classroom;

import java.util.Stack;

public class SpiralOrder {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.left.left.left = new Node(8);
        head.left.left.right = new Node(9);
        head.right.left.left = new Node(10);
        head.right.left.right = new Node(11);

        printSpiral(head);
    }

    private static void printSpiral(Node node) {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(node);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    Node temp = s1.pop();
                    if (temp.left != null)
                        s2.push(temp.left);
                    if (temp.right != null)
                        s2.push(temp.right);
                    System.out.print(temp.data + " ");
                }
            } else if (!s2.isEmpty()) {
                while (!s2.isEmpty()) {
                    Node temp = s2.pop();
                    if (temp.right != null)
                        s1.push(temp.right);
                    if (temp.left != null)
                        s1.push(temp.left);
                    System.out.print(temp.data + " ");
                }
            }
        }
    }
}
