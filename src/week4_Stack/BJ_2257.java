package week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class BJ_2257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                while (c != ')') {
                    stack.push(c);
                    i++;
                    c = str.charAt(i);
                }
                while (!stack.isEmpty()) {
                    if (Character.isDigit(stack.peek())) {
                        char digit = stack.pop();
                        result += ((int) (digit) * toInt(stack.pop()));
                    }
                    else if (stack.peek() == 'C' || stack.peek() == 'O' || stack.peek() == 'H') {
                        result += toInt(stack.pop());
                    }
                    else stack.pop();
                }
            }
            else if (Character.isDigit(c)) {
                result *= c;
            }
            else {
                c = str.charAt(i);
                while (c != '(' && i < str.length()) {
                    stack.push(c);
                    c = str.charAt(i);
                    i++;
                }
                while (!stack.isEmpty()) {
                    if (Character.isDigit(stack.peek())) {
                        char digit = stack.pop();
                        result += ((int) (digit) * toInt(stack.pop()));
                    }
                    else if (stack.peek() == 'C' || stack.peek() == 'O' || stack.peek() == 'H') {
                        result += toInt(stack.pop());
                    }
                    else stack.pop();
                }
            }
        }
        System.out.println(result);
    }
    static int toInt(char c) {
        if (c == 'C') return 12;
        else if (c == 'O') return 16;
        else return 1;
    }
}
