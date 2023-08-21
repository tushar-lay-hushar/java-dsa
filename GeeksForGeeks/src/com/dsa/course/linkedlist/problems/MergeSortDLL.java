package com.dsa.course.linkedlist.problems;

public class MergeSortDLL {

    public static void main(String[] args) {
        NodeDLL head = new NodeDLL(8);

    }

    private static NodeDLL mergeSort(NodeDLL head) {
        if (head == null || head.next == null)
            return head;

        NodeDLL mid = findMid(head);
        NodeDLL left = head;
        NodeDLL right = mid.next;
        mid.next = null;
        right.prev = null;

        NodeDLL ls = mergeSort(left);
        NodeDLL rs = mergeSort(right);

        return merge(ls, rs);
    }

    private static NodeDLL merge(NodeDLL left, NodeDLL right) {
        NodeDLL dummy = new NodeDLL(-1);
        NodeDLL curr = dummy;

        while (left != null || right != null) {
            if (left.data < right.data) {
                curr.next = left;
                left.prev = curr;
                curr = curr.next;
                left = left.next;
            }
            else {
                curr.next = right;
                right.prev = curr;
                curr = curr.next;
                right = right.next;
            }

            if (left != null) {
                curr.next = left;
                left.prev = curr;
            }

            if (right != null) {
                curr.next = right;
                right.prev = curr;
            }
        }
        dummy = dummy.next;
        dummy.prev = null;

        return dummy;
    }

    private static NodeDLL findMid(NodeDLL head) {
        NodeDLL slow = head;
        NodeDLL fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
