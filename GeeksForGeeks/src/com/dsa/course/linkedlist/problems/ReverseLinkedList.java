package com.dsa.course.linkedlist.problems;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        printlist(head);
        head = reverse(head);
        printlist(head);
    }

    private static Node reverse(Node head) {
        Node newHead = null;
        Node temp = null;

        while(head != null) {
            temp = head;
            head = head.next;
            temp.next = null;
            temp.next = newHead;
            newHead = temp;
        }
        return newHead;
    }

    private static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
