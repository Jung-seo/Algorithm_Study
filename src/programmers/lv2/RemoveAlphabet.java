package programmers.lv2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973

import java.util.Stack;

public class RemoveAlphabet {
    public static void main(String[] args) {

        String s = "baab";

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            if (stack.empty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            }
            else if (stack.peek() == s.charAt(i)) {
                stack.pop();
            }
        }
        System.out.println(stack.empty() ? 1 : 0);
    }
}
