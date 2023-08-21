package com.dsa.course.tree.classroom;

import java.util.Stack;

public class IterativePreorder {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(40);
        head.left.right = new Node(50);
        head.right.left = new Node(60);

        iterPreorder(head);

    }

    private static void iterPreorder(Node node) {
        if (node == null)
            return;

        Stack<Node> s = new Stack<>();
        s.push(node);
        while (!s.isEmpty()) {
            Node curr = s.pop();
            System.out.println(curr.data + " ");
            if (curr.right != null)
                s.push(curr.right);
            if (curr.left != null)
                s.push(curr.left);
        }

    }
}
