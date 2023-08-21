package com.dsa.course.bst.classroom;

public class Floor {

    public static void main(String[] args) {

        Node head = new Node(50);
        head.left = new Node(30);
        head.left.left = new Node(20);
        head.left.right = new Node(40);
        head.right = new Node(70);
        head.right.left = new Node(60);
        head.right.left.left = new Node(55);
        head.right.left.right = new Node(65);
        head.right.right = new Node(80);

        System.out.println(floor(head, 35));
    }

    private static Node floor(Node node, int x) {

        Node res = null;
        while (node != null) {
            if (node.data == x)
                return node;
            else if (node.data > x)
                node = node.left;
            else {
                res = node;
                node = node.right;
            }
        }
        return res;
    }
}
