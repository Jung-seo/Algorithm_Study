package programmers.lv2;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class Brackets {
    public static void main(String[] args) {

        String s = "(()(";
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (stack.isEmpty() && c == ')') {
                answer = false;
                return;
            }
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
            }
        }

        System.out.println(stack.isEmpty());
    }
}
