package com.dsa.course.linkedlist.problems;

public class SwapKthNodes {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = new Node(7);
        printlist(head);
        head = swap(head, 4, 1);
        printlist(head);
    }

    private static Node swap(Node head, int num, int K) {
        if(K > num)
            return head;

        int one = K, two = num - K + 1;
        int k1 = Math.min(one,two);//for cases - k>(num/2)
        int k2 = Math.max(one,two);

        Node temp1 = null, temp2 = null;//to hold next nodes of swapnode
        Node prev1 = null, prev2 = null;//to hold prev nodes of swapnode
        Node first = null, second = null;//to hold the swap nodes
        Node curr = head;//for traversing

        while(k1-- != 0){
            if(k1 == 0){
                first = curr;break;
            }
            curr = curr.next;
        }

        temp1 = curr.next;
        curr = head;

        while(k2-- != 0){
            if(k2==0){
                second = curr;break;
            }
            curr = curr.next;
        }

        temp2 = curr.next;
        curr = head;

        while(curr != null){
            if(curr.next == first)
                prev1 = curr;
            if(curr.next == second)
                prev2 = curr;
            curr = curr.next;
        }

        //for handling cases when first and second are adjacent to each other
        if(first.next == second){
            Node t = second;
            first.next = temp2;
            if(prev1 == null)
                head = second;
            else
                prev1.next = second;
            second.next = first;
            return head;
        }

        first.next = temp2;
        second.next = temp1;
        if(prev1 == null)
            head = second;
        else
            prev1.next = second;
        prev2.next = first;
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
