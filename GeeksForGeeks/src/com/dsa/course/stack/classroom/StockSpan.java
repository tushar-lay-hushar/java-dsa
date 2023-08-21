package com.dsa.course.stack.classroom;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        int arr[] = {60,10,20,40,35,30,50,70,65};
        printSpan(arr, arr.length);
    }

    private static void printSpan(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.print(1);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            System.out.print(" " + (stack.isEmpty() ? i + 1 : i - stack.peek()));
            stack.push(i);
        }
    }
}
