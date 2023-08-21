package com.dsa.course.stack.classroom;

import java.util.Stack;

public class LargestRectangularHistogramArea {
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,5,1,6};
        printLargestArea(arr, arr.length);
    }

    private static void printLargestArea(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int temp = stack.pop();
                int curr = arr[temp] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
                res = Math.max(res, curr);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            int curr = arr[temp] * (stack.isEmpty() ? n : (n - stack.peek() - 1));
            res = Math.max(res, curr);
        }
        System.out.println(res);
    }
}
