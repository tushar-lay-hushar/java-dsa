package com.dsa.course.linkedlist.problems;

public class PairWiseSwap {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        printlist(head);
        head = pairWiseSwap(head);
        printlist(head);
    }

    private static Node pairWiseSwap(Node head) {
        Node prev = null;
        Node curr = head;
        Node currNext = head.next;

        while(curr.next != null) {
            if(curr == head) {
                head = currNext;
            }
            if(prev != null) {
                prev.next = currNext;
            }
            curr.next = currNext.next;
            currNext.next = curr;
            prev = curr;
            curr = curr.next;
            currNext = curr.next;
        }
        return head;
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
