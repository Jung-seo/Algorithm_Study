package week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class BJ_2257_recursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            int result = 0;

            if (stack.peek() == 'C' || stack.peek() == 'H' || stack.peek() == 'O'){
                stack2.push(toInt(stack.pop()));
            }
            else if (stack.peek() == '(') {

            }
            else { // 숫자 일때

            }
        }
    }
    static int toInt (char c) {
        if (c == 'C') return 12;
        else if (c == 'H') return 16;
        else return 1;
    }
    static int recursion (){
        return 0;
    }
}
