package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/8958
public class BJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testcase = Integer.parseInt(br.readLine());

        for (int k = 0; k < testcase; k++) {
            String str = br.readLine();
            // X 기준으로 배열로 나누고
            String[] arr = str.split("X");

            int score = 0;

            for (int i = 0; i < arr.length; i++) {
                // 배열에 공백 지우고
                arr[i] = arr[i].replace(" ", "");

                if (arr[i] != "") {
                    for (int j = 1; j <= arr[i].length(); j++) { // 문자열 개수가 O 개수
                        score += j;
                    }
                }
            }
            sb.append(score + "\n");
        }
        System.out.println(sb);
    }
}
