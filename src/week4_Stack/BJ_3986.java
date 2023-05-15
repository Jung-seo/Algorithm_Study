package week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> strStack = new Stack<>();
        Stack<Character> result = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                strStack.push(str.charAt(j));
            }
            while (!strStack.isEmpty()) {
                char c = strStack.pop();

                if (!result.isEmpty() && c == result.peek())
                    result.pop();
                else result.push(c); // result 비었을때
            }
            if (result.isEmpty()) count++;
            result.clear();
        }
        System.out.print(count);
    }
}