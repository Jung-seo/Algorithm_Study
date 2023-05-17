package week5_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1158

public class BJ_1158 { // 요세푸스 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();
        sb.append("<");
        for (int i = 1; i <= N; i++) {
            que.offer(i);
        }
        while (!que.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                que.offer(que.poll());
            }
            sb.append(que.poll()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.println(sb);
    }
}
