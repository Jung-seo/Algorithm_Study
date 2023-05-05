package stepBYstep.ch06;

import java.util.Scanner;

public class BJ_3003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
//        킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        int[] standard = {1, 1, 2, 2, 2, 8};
        int[] mine = new int[6];

        for (int i = 0; i < 6; i++) {
            mine[i] = sc.nextInt();
            sb.append(standard[i] - mine[i] + " ");
        }
        System.out.println(sb);
    }
}
