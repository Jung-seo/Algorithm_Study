package week5_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            que.offer(i);
        }
        while (que.size() != 1) {
            System.out.print(que.poll() + " ");
            que.offer(que.poll());
        }
        System.out.print(que.poll());
    }
}
