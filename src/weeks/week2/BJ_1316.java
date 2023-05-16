package weeks.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1316
public class BJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int groupWord = 0;
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            str = br.readLine();

            int[] arr1 = new int[str.length()]; // 문자열 인덱스별 알파벳 등장 횟수
            int[] arr2 = new int[str.length()]; // 알파벳 등장 횟수와 연속으로 나온 횟수 비교용

            if (str.length() == 1) {
                groupWord++;
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k)) {
                        arr1[j]++;
                    }
                }
            }
            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k))
                        arr2[j]++;
                    else break;
                }
            }
            if (Arrays.toString(arr1).equals(Arrays.toString(arr2)))
                groupWord++;
        }
        System.out.println(groupWord);

    }
}
