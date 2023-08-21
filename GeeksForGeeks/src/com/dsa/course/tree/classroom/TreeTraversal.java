package com.dsa.course.tree.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.right.left = new Node(40);
        head.right.right = new Node(50);

        inorder(head);
        System.out.println();
        preorder(head);
        System.out.println();
        postorder(head);
        System.out.println();
        levelOrder(head);
        System.out.println();
        levelOrderAdv(head);
    }

    private static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    private static void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    private static void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    private static void levelOrder(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }

    private static void levelOrderAdv(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while (q.size() > 1) {
            Node temp = q.poll();
            if (temp == null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(temp.data + " ");
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }
}
