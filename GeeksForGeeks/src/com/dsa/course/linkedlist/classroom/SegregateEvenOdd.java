package com.dsa.course.linkedlist.classroom;

public class SegregateEvenOdd {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        printlist(head);
        head = segregate(head);
        printlist(head);
    }

    private static Node segregate(Node head) {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = evenStart;
                }
                else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            }
            else {
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = oddStart;
                }
                else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            curr = curr.next;
        }

        if (oddStart == null || evenStart == null)
            return head;

        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;

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
