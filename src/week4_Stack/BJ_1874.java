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

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        int start = 1;

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());

//            처음 || 스텍 < 배열
             if ((start == 1) || (!stack.isEmpty() && stack.peek() < arr[i])) {
                while (start <= arr[i]) {
                    stack.push(start);
                    sb.append("+\n");
                    start++;
                    if (start > num + 1 ) {
                        System.out.println("NO");
                        return;
                    }
                }
                stack.pop();
                sb.append("-\n");
            }
//             배열 < 스택
            else if (!stack.isEmpty() && stack.peek() > arr[i]) {
                  while (stack.peek() > arr[i]) {
                    stack.pop();
                    sb.append("-\n");
                    if (stack.isEmpty()) {
                        System.out.println("no");
                        return;
                    }
                }
                stack.pop();
                sb.append("-\n");
            }

            else if (!stack.isEmpty() && stack.peek() == arr[i]) {
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


수열을 배열에 넣는다 int[] arr

int[i] stack 비교 stack이 비면 NO
작으면 push
같으면 pop
크면 pop



*/
