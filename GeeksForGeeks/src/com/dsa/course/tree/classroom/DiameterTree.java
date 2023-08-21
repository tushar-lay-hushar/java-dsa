package com.dsa.course.tree.classroom;

public class DiameterTree {

    public static void main(String[] args) {

    }

    private static int diameter(Node node) {
        if (node == null)
            return 0;

        int currDiam = 1 + height(node.left) + height(node.right);
        int leftDiam = diameter(node.left);
        int rightDiam = diameter(node.right);

        return Math.max(currDiam, Math.max(leftDiam, rightDiam));
    }

    private static int height(Node node) {
        if (node == null)
            return 0;
        else
            return Math.max(height(node.left), height(node.right)) + 1;
    }

}
