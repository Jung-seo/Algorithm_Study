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
        int[] arr = new int[testCase];

        int num = 1;

        for (int i = 0; i < testCase; i++) {
            arr[i] = Integer.parseInt(br.readLine());

//            스텍은 비었는데 더 넣을 수 있을때 || 처음 || 스텍 < 배열
             if (num <= arr[i] || num == 1 || (!stack.isEmpty() && stack.peek() < arr[i])) {
                while (num <= arr[i]) {
                    stack.push(num);
                    sb.append("+\n");
                    num++;
                    if (num > testCase + 1 ) {
                        System.out.println("NO");
                        return;
                    }
                }
                stack.pop();
                sb.append("-\n");
            }
//             배열 <= 스택
            else if (!stack.isEmpty() && stack.peek() >= arr[i]) {
                  while (stack.peek() != arr[i]) { // 스택 == 배열일때 false
                    stack.pop();
                    sb.append("-\n");
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        return;
                    }
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}

/*

작으면 push
같으면 pop
크면 pop

*/
