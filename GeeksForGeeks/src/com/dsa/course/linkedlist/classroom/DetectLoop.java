package com.dsa.course.linkedlist.classroom;

public class DetectLoop {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
//        head.next.next.next.next.next.next.next = head.next.next.next;

        System.out.println(isLoop(head));
    }

    private static boolean isLoop(Node head) {

        Node slow = head, fast = head.next;
        while(slow != null && fast != null && fast.next != null) {
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
