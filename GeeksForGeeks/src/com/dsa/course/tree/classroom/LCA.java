package com.dsa.course.tree.classroom;

public class LCA {
    public static void main(String[] args) {

    }

    Node lca(Node node, int n1, int n2) {
        if (node == null)
            return null;

        if (node.data == n1 || node.data == n2)
            return node;

        Node lca1 = lca(node.left, n1, n2);
        Node lca2 = lca(node.right, n1, n2);

        if (lca1 != null && lca2 != null)
            return node;

        if (lca1 != null)
            return lca1;
        else
            return lca2;
    }
}
