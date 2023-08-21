package com.dsa.course.tree.classroom;

import java.util.ArrayList;

public class BinaryTreeFromInPreOrder {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        System.out.println(al);
        System.out.println(al.remove(0));
        System.out.println(al.remove(0));
        System.out.println(al.remove(0));


    }

    private static int preindex = 0;
    private static Node constructTree(int[] inOrder, int[] preOrder, int is, int ie) {
        if (is > ie) return null;

        Node node = new Node(preOrder[preindex++]);

        int inIndex = 0;
        for (int i = is; i <= ie; i++) {
            if (inOrder[i] == node.data) {
                inIndex = i;
                break;
            }
        }

        node.left = constructTree(inOrder, preOrder, is, inIndex - 1);
        node.left = constructTree(inOrder, preOrder,inIndex + 1, ie);

        return node;
    }
}
