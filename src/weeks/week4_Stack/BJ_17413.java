package weeks.week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
//            < 나올때
            if (str.charAt(i) == '<') {
                while (str.charAt(i) != '>') {
                    sb.append(str.charAt(i));
                    i++;
                }
                i--;
            }
            else if (str.charAt(i) == ' '){
                sb.append(" ");
            }
            else if (str.charAt(i) == '>'){
                sb.append(">");
            }
//            나머지
            else {
                while (str.charAt(i) != ' ' && str.charAt(i) != '<') {
                    stack.push(str.charAt(i));
                    i++;
                    if (i == str.length()) break;
                }
                i--;
                while (!stack.isEmpty())
                    sb.append(stack.pop());
            }
        }
        System.out.print(sb);
    }
}

