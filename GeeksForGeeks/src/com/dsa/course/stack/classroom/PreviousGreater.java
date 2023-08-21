package com.dsa.course.stack.classroom;

import java.util.Stack;

public class PreviousGreater {

    public static void main(String[] args) {
        int arr[] = {15,10,18,12,4,6,2,8};
        printGreater(arr, arr.length);
    }

    private static void printGreater(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.print(-1);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            System.out.print(" " + (stack.isEmpty() ? -1 : stack.peek()));
            stack.push(arr[i]);
        }
    }
}
