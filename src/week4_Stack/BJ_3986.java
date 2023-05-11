package week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                stack.push(str.charAt(j));
            }
            while (!stack.isEmpty()) {
                char c = stack.pop();

                if (!stack2.isEmpty() && c == stack2.peek())
                    stack2.pop();
                else if (!stack.isEmpty() && c == stack.peek())
                    stack.pop();
                else stack2.push(c);
            }
            if (stack2.isEmpty()) count++;
            stack.clear();
            stack2.clear();
        }
        System.out.println(count);
    }
}
