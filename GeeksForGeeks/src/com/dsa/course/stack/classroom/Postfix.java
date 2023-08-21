package com.dsa.course.stack.classroom;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
    }

    private static String getPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

            }
        }
        StringBuilder str = new StringBuilder();
        str.insert(1, 'a');
        return null;
    }
}
