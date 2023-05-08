package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_2493_stackOnly {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> result = new Stack<>();

        int towerNum = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int index = 0;
        int maxTowerIndex = 0;
        int maxTowerHeight = 0;
        stack.push(0);

        while (st.hasMoreTokens()) {
            int tower = Integer.parseInt(st.nextToken());
            index++;

            if (stack.peek() < tower && tower < maxTowerHeight) {
                stack.push(tower);
                result.push(maxTowerIndex);
            }
            else if (stack.peek() < tower) {
                stack.push(tower);
                maxTowerHeight = tower;
                maxTowerIndex = index;
                result.push(0);
            }
            else if (tower <= stack.peek()) {
                result.push(index - 1);
            }
            else {
                stack.push(tower);
                result.push(index - 1);
            }
        }
        result.forEach(el -> System.out.print(el + " "));
    }
}
