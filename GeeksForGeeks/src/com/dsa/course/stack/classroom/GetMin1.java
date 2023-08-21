package com.dsa.course.stack.classroom;

import java.util.Stack;

public class GetMin1 {
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
    private static Stack<Integer> minStack = new Stack<>();

    private static int push(int num) {
        stack.push(num);
        if (!minStack.isEmpty() && minStack.peek() >= stack.peek())
            minStack.push(num);
        else if (minStack.isEmpty()) minStack.push(num);

        return num;
    }

    private static int pop() {
        int num = -1;
        if (!stack.isEmpty()) {
            num = stack.pop();
            if (minStack.peek() == num)
                minStack.pop();
        }

        return num;
    }

    private static int getMin() {
        return minStack.peek();
    }
}
