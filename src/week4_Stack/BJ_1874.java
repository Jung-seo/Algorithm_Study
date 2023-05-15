package week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        int num = 1; // 스텍에 넣을 숫자

        for (int i = 0; i < testCase; i++) {
            int input = Integer.parseInt(br.readLine());
//            스텍은 비었는데 더 넣을 수 있을때  || 스텍 peek < 입력
             if (num <= input || (!stack.isEmpty() && stack.peek() < input)) {
                while (num <= input) {
                    stack.push(num);
                    sb.append("+\n");
                    num++;
                }
                stack.pop();
                sb.append("-\n");
            }
//             입력 <= 스택
            else if (!stack.isEmpty() && stack.peek() >= input) {
                  while (stack.peek() != input) { // 스택 == 입력 일때 fase
                    stack.pop();
                    sb.append("-\n");

                }
                stack.pop();
                sb.append("-\n");

             }
            else { // 더이상 스텍에 넣을 숫자가 없을때
                System.out.print("NO");
                return;
            }
        }
        System.out.print(sb);
    }
}
