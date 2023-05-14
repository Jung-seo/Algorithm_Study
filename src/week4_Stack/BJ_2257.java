package week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_2257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        String str = br.readLine();
        int result = 0;
        int multiple = 1;

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) break;
            char c = stack.peek();

            if (c == 'C' || c == 'H' || c == 'O') {
                result += toInt(c) * multiple;
                stack2.push(result);
                stack.pop();
                multiple = 1;
            }
            else if (c == ')') {
                stack.pop();
                while (stack.peek() != '(') {
                    if (Character.isDigit(stack.peek())) {
                        result += (stack.pop() - '0') * toInt(stack.pop());
                    }
                    result += toInt(stack.pop());
                }
                stack.pop();
                result = result * multiple;
                stack2.push(result);
                multiple = 1;
            }
            else { // 숫자일때
                multiple = stack.pop() - '0';
            }
            result = 0;
        }
        while (!stack2.isEmpty()) {
            result += stack2.pop();
        }
        System.out.println(stack2.size());
        System.out.println(stack.size());
        System.out.print(result);
    }
//    CH(CO2H)3
//    3)H2OC(HC
    static int toInt(char c) {
        if (c == 'C') return 12;
        else if (c == 'O') return 16;
        else return 1;
    }
    static void recursion ()
}

/*
* ( 가 나올때 )가 나올때까지 값을 스텍에 넣고 재귀
* 괄호 안의 값을 계산 후 스택2에 넣고
* 숫자가 나오면 스택2 pop()에 해당 숫자를 곱하고 다시 push()
*  */