package weeks.week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_2257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            int result = 0;

            if (cur == 'C' || cur == 'H' || cur == 'O'){
                stack.push(toInt(cur));
            }
            else if (cur == '(') {
                stack.push(0);
            }
            else if (cur == ')') {
                while (stack.peek() != 0) {
                    result += stack.pop();
                }
                stack.pop();
                stack.push(result);
            }
            else { // 숫자 일때
                stack.push(stack.pop() * (cur - '0'));
            }
        }
        System.out.print(stack.stream().mapToInt(el -> el).sum());
    }
    static int toInt (char c) {
        if (c == 'C') return 12;
        else if (c == 'H') return 1;
        else return 16;
    }
}


/*
* ( 가 나올때 )가 나올때까지 값을 스텍에 넣고 재귀
* 괄호 안의 값을 계산 후 스택2에 넣고
* 숫자가 나오면 스택2 pop()에 해당 숫자를 곱하고 다시 push()
*  */