package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String order = br.readLine();

            if (order.contains("push")) {
                String[] arr = order.split(" ");
                stack.push(Integer.parseInt(arr[1]));
            }
            if (order.equals("size")) sb.append(stack.size() + "\n");
            if (order.equals("empty"))  {
                if (stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
            if (order.equals("top")) {
                if (stack.size() == 0) sb.append("-1\n");
                else sb.append(stack.peek() + "\n");
            }
            if (order.equals("pop")) {
                if (stack.size() == 0) sb.append("-1\n");
                else sb.append(stack.pop() + "\n");
            }
        }
        System.out.println(sb);
    }
}
