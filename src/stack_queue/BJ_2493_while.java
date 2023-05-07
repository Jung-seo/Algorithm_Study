package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2493_while {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int towerNum = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));

        int right = list.size() - 1;
        int left = right - 1;

        while (0 < right) {

            if (left < 0) {
                stack.add(0);
                right--;
                if (right == 0) break;
                left = right - 1;
            }

            if(list.get(right) <= list.get(left)) {
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
