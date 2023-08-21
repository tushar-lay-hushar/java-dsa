package com.dsa.course.stack.classroom;

import java.util.Stack;

public class NextGreater {

    public static void main(String[] args) {
        int arr[] = {5,15,10,8,6,12,9,18};
        printGreater(arr, arr.length);
    }

    private static void printGreater(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> printStack = new Stack<>();
        stack.push(arr[n - 1]);
        printStack.push(-1);
        for (int i = n - 2; i > -1; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            printStack.push(stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }

        while(!printStack.isEmpty()) {
            System.out.print(" " + printStack.pop());
        }
    }
}
