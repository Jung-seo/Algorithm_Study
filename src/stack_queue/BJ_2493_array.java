package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2493_array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int towerNum = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String[] strArr = str.split(" ");
        int[] intArr = new int[towerNum];

        for (int i = 0; i < towerNum; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int right = towerNum - 1;
        int left = right - 1;

        while (0 < right) {

            if (left < 0) {
                stack.add(0);
                right--;
                if (right == 0) break;
                left = right - 1;
            }

            if(intArr[right] <= intArr[left]) {
                stack.add(left + 1);
                right--;
                if (right == 0) break;
                left = right - 1;
            }

            else left--;
        }

        stack.add(0);
        while (!stack.empty()) System.out.print(stack.pop() + " ");
    }
}
