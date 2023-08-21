package com.dsa.course.stack.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParanthesis {

    public static void main(String[] args) {
        String str = ")))";
        System.out.println(isBalanced(str));
    }

    private static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                if(stack.isEmpty())
                    return false;
                if(!matching(stack.peek(), ch))
                    return false;
                else
                    stack.pop();
            }
        }
        return (stack.isEmpty());
    }

    private static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']'));
    }
}
