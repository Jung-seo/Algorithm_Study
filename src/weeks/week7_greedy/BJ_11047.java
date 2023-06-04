package weeks.week7_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11047

public class BJ_11047 { // 동전 0
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] tokens = new int[n];

        for (int i = 0; i < n; i++) {
            tokens[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = tokens.length - 1; 0 <= i; i--) {
            if (tokens[i] <= k) {
                count += k / tokens[i];
                k = k % tokens[i];
            }
            if (k == 0) break;
        }
        System.out.print(count);
    }
}
