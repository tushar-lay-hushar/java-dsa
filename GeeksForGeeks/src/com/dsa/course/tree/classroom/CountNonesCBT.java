package com.dsa.course.tree.classroom;

public class CountNonesCBT {
    public static void main(String[] args) {

    }

    private static int countNode(Node node) {
        int lh = 0;
        int rh = 0;

        Node curr = node;
        while (curr != null) {
            lh++;
            curr = curr.left;
        }

        curr = node;
        while (curr != null) {
            rh++;
            curr = curr.right;
        }

        if (lh == rh)
            return (int) Math.pow(2, lh) - 1;

        return countNode(node.left) + countNode(node.right) + 1;
    }
}
