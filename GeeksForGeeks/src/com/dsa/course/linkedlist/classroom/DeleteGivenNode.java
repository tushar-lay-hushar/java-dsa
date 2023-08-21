package com.dsa.course.linkedlist.classroom;

public class DeleteGivenNode {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);

        printlist(head);
        deleteNode(head.next.next);
        printlist(head);
    }

    private static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
