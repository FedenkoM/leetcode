package org.leetcode.problems.easy.openParantesess;

import java.util.Stack;

public class OpenParenthesesSolution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if ((c == ')' && pop != '(') ||
                    (c == '}' && pop != '{') ||
                    (c == ']' && pop != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}