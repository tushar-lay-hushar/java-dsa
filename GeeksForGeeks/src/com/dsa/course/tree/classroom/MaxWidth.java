package com.dsa.course.tree.classroom;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MaxWidth {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(30);
        head.left.left = new Node(40);
        head.left.right = new Node(50);
        head.right.left = new Node(60);

        System.out.println(maxWidth(head));
    }

    private static int maxWidth(Node node) {
        if (node == null)
            return 0;

        Map<String, String> m = new HashMap<>();
        m.putIfAbsent("hello", "hello");
        m.put("hello", "hello");

        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int res = 0;

        while(!q.isEmpty()) {
            int count = q.size();
            res = Math.max(res, count);

            for (int i = 0; i < count; i++) {
                Node temp = q.poll();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
        return res;
    }
}
