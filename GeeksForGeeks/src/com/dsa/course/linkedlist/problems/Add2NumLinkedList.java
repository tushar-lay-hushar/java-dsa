package com.dsa.course.linkedlist.problems;

public class Add2NumLinkedList {

    public static void main(String[] args) {
        Node head1 = new Node(4);
        head1.next = new Node(5);

        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);

        Node result = addTwoLists(head1, head2);

        printlist(result);
    }

    private static Node addTwoLists(Node first, Node second) {
        Node dummy = new Node(0);
        Node head = dummy;

        first = reverse(first);
        second = reverse(second);

        Node tempFirst = first;
        Node tempSecond = second;
        int carry = 0;
        while (tempFirst != null || tempSecond != null || carry != 0) {
            int sum = 0;
            if(tempFirst != null) {
                sum += tempFirst.data;
                tempFirst = tempFirst.next;
            }
            if(tempSecond != null) {
                sum += tempSecond.data;
                tempSecond = tempSecond.next;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;

            Node last = new Node(sum);
            head.next = last;
            head = head.next;
        }
        return reverse(dummy.next);
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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