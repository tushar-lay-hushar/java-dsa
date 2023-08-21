package com.dsa.course.bst.classroom;

import java.util.ArrayList;

public class DeleteNode {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.sort((num1, num2) ->  num1 - num2);
    }

    private static Node delNode(Node node, int x) {
        if(node == null)
            return null;
        if(node.data > x)
            node.left = delNode(node.left, x);
        else if (node.data < x)
            node.right = delNode(node.right, x);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;
            else {
                Node succ = getSucc(node);
                node.data = succ.data;
                node.right = delNode(node.right, succ.data);
            }
        }
        return node;
    }

    private static Node getSucc(Node node) {
        Node curr = node.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }
}
