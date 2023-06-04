package weeks.week7_greedy;

//https://www.acmicpc.net/problem/2217

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2217 { // 로프
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];
        for (int i = 0; i < ropes.length; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        int[] weights = new int[ropes.length];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = ropes[i] * (ropes.length - i);
        }
        Arrays.sort(weights);
        System.out.print(weights[weights.length - 1]);
    }
}
