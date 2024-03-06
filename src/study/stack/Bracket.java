package study.stack;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class Bracket {
    public static void main(String[] args) {

        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));
    }

    public static boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (stack.isEmpty() && c == ')') {
                return false;
            }
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
