package weeks.week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack <int[]> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= num; i++) {
            int tower = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()) {
                if (tower <= stack.peek()[1] ) {
                    sb.append(stack.peek()[0]).append(" ");
                    stack.push(new int[] { i, tower});
                    break;
                }
                stack.pop();
            }
            if (stack.isEmpty()) { // 스택이 비어 있을때 -> 처음 || 바로 전이 가장 높은 탑
                stack.push(new int[] {i, tower});
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }
}
// 6 9 5 7 4