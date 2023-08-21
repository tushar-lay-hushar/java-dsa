package com.dsa.course.stack.classroom;

import java.util.Stack;

public class GetMin2 {
    public static void main(String[] args) {
        push(5);
        System.out.println(getMin());
        push(10);
        System.out.println(getMin());
        push(20);
        System.out.println(getMin());
        push(2);
        System.out.println(getMin());
        push(6);
        System.out.println(getMin());
        push(4);
        System.out.println(getMin());
        pop();
        System.out.println(getMin());
        pop();
        System.out.println(getMin());
        push(2);
        System.out.println(getMin());
        pop();
        System.out.println(getMin());
        push(1);
        System.out.println(getMin());
        pop();
        System.out.println(getMin());
        pop();
        System.out.println(getMin());
    }

    private static Stack<Integer> stack = new Stack<>();
    private static int min = 0;

    private static int push(int num) {
        if (stack.isEmpty()) {
            min = num;
            stack.push(num);
        }
        else if (min >= num) {
            stack.push(num - min);
            min = num;
        }
        else stack.push(num);

        return num;
    }

    private static int pop() {
        int num = -1;
        if (!stack.isEmpty()) {
            num = stack.pop();
            if (num < 0) {
                min = min - num;
                num = min;
            }
        }
        return num;
    }

    private static int getMin() {
        return min;
    }
}
