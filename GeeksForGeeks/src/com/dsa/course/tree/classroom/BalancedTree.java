package com.dsa.course.tree.classroom;

public class BalancedTree {
    public static void main(String[] args) {

    }

    private static int isBalanced(Node node) {
        if (node == null)
            return 0;

        int lh = isBalanced(node.left);
        if (lh == -1)
            return -1;

        int rh = isBalanced(node.right);
        if (rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;

        else return Math.max(lh, rh) + 1;
    }
}
