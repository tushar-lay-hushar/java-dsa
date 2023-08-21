package com.dsa.course.stack.classroom;

import java.util.Stack;

public class LargestRectangleArea {

    public static void main(String[] args) {
        int arr[][] = {
                {1,0,0,1,1},
                {0,0,0,1,1},
                {1,1,1,1,1},
                {0,1,1,1,1}
        };

        printArea(arr);
    }

    private static void printArea(int arr[][]) {
        Stack<Integer> stack = new Stack<>();
        int res = largestHist(arr[0], arr[0].length);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1)
                    arr[i][j] = arr[i][j] + arr[i - 1][j];
            }
            res = largestHist(arr[i], arr[i].length);
        }

        System.out.println(res);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int largestHist(int arr[], int len) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int temp = stack.pop();
                int curr = arr[temp] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
                res = Math.max(curr, res);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int temp = stack.pop();
            int curr = arr[temp] * (stack.isEmpty() ? len : (len - stack.peek() - 1));
            res = Math.max(curr, res);
        }

        return res;
    }
}
