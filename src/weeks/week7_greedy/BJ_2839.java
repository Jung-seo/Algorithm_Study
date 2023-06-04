package weeks.week7_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//https://www.acmicpc.net/problem/2839
public class BJ_2839 { // 설탕 배달
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n / 5; i++) {
            int num = n - 5 * i;
            if (num == 0) {
                list.add(new int[]{i, 0});
                continue;
            }
            for (int j = 1; j <= n / 3; j++) {
                if (num % (3 * j) == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }
        if (list.isEmpty()) {
            System.out.println("-1");
            return;
        }

        int result = Arrays.stream(list.get(list.size() - 1)).sum();
        System.out.println(result);
    }
}
