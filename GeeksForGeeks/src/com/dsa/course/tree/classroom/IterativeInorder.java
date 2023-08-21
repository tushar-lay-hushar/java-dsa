package com.dsa.course.tree.classroom;

import java.util.Stack;

public class IterativeInorder {
    public static void main(String[] args) {

    }

    private static void iterInorder(Node node) {
        Stack<Node> stack = new Stack<>();
        Node curr = node;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
}
