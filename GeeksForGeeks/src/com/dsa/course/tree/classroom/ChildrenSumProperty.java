package com.dsa.course.tree.classroom;

public class ChildrenSumProperty {

    public static void main(String[] args) {

        Node head = new Node(20);
        head.left = new Node(8);
        head.left.left = new Node(3);
        head.left.right = new Node(5);
        head.right = new Node(12);

        System.out.println(childrenSum(head));
    }

    private static boolean childrenSum(Node node) {
        if (node == null)
            return true;

        if (node.left == null && node.right == null)
            return true;

        int sum = 0;
        if (node.left != null)
            sum += node.left.data;
        if (node.right != null)
            sum += node.right.data;

        return (node.data == sum && childrenSum(node.left) && childrenSum(node.right));
    }
}
