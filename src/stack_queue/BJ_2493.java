package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_2493 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxHeight = 0;
        int maxIn = 0, count = 1, goBack = 0;

        while (st.hasMoreTokens()) {
            int current = Integer.parseInt(st.nextToken());
            if (maxHeight <= current) {
                stack.clear();
                maxHeight = current;
                maxIn = count;
                stack.push(current);
                sb.append(0 + " ");
            }
            else if (current < stack.peek()) {
                stack.push(current);
                sb.append(count - 1).append(" ");
            }
            else if (stack.peek() < current){
                Stack<Integer> clonedStack = (Stack<Integer>) stack.clone();
                while (clonedStack.peek() <= current) {
//                    clonedStack.push(stack.pop());
                    clonedStack.pop();
                    goBack++;
                }
//                while (!clonedStack.isEmpty()) {
//                    stack.push(clonedStack.pop());
//                }
                clonedStack.clear();
                stack.push(current);
                sb.append(count - goBack - 1).append(" ");
                goBack = 0;
            }
            count++;
        }
        System.out.println(sb);
    }
}

/*
* 5
6 9 5 7 4
*
* n개 만큼의 탑
* 오른쪽탑보다 높은 가장 가까운 왼쪽의 탑 번호를 출력
* 없으면 0
*
* 스텍에 하나씩 넣고 max가 나오면 max, maxIn에 할당
* max보다 작고 전의 탑보다 크면 maxIn 출력
* 전의 탑보다 작으면 전의 탑 출력
*
*/
