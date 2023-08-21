package com.dsa.course.linkedlist.problems;

import java.util.HashMap;

public class CloneLinkedList {

    public static void main(String[] args) {

    }

    private static Node clone(Node head) {

        Node curr = head;

        HashMap<Node, Node> nodeMap = new HashMap<>();

        while (curr != null) {
            nodeMap.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        curr = head;
        while (curr.next != null) {
            Node temp = nodeMap.get(curr);
            temp.next = nodeMap.get(curr.next);
            temp.random = nodeMap.get(curr.random);
            curr = curr.next;
        }

        return nodeMap.get(head);
    }
}
