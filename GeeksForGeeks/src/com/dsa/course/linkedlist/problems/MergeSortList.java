package com.dsa.course.linkedlist.problems;

public class MergeSortList {

    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(2);
        printlist(head);
        head = mergeSort(head);
        printlist(head);
    }

    private static Node mergeSort(Node head) {

        if(head == null || head.next == null)
            return head;

        Node mid = findMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        Node ls = mergeSort(left);
        Node rs = mergeSort(right);

        return merge(ls, rs);
    }

    private static Node merge(Node left, Node right) {
        Node head = new Node(0);
        Node curr = head;

        while(left != null && right != null) {
            if(left.data < right.data) {
                curr.next = left;
                curr = curr.next;
                left = left.next;
            }
            else {
                curr.next = right;
                curr = curr.next;
                right = right.next;
            }
        }

        if(left != null)
            curr.next = left;

        if(right != null)
            curr.next = right;

        return head.next;
    }

    private static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
