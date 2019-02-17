package com.example.week6daily5testassignment;

import java.util.Stack;

public class Problem5 {
    public static void main(String args[]) {

        System.out.println(parenthensiesOrderCorrect("{(a,b)}"));
        System.out.println(parenthensiesOrderCorrect("{(a},b)"));
        System.out.println(parenthensiesOrderCorrect("{)(a,b}"));
    }

    public static boolean parenthensiesOrderCorrect(String s) {
        Stack<Character> stack  = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
