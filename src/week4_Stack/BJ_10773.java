package week4_Stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) stack.pop();
            else stack.push(input);
        }
        int sum = 0;
        System.out.println(stack.stream().mapToInt(el -> el).sum());
    }
}
