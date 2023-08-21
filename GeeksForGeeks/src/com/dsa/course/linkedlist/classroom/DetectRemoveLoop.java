package com.dsa.course.linkedlist.classroom;

public class DetectRemoveLoop {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = head.next.next.next;
        System.out.println(isLoop(head));
        removeLoop(head);
        System.out.println(isLoop(head));
    }

    private static boolean isLoop(Node head) {
        Node slow = head, fast = head;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    private static void removeLoop(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if(slow != fast)
            return;

        slow = head;
        while(slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
}
