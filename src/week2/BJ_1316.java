package week2;

import com.sun.security.jgss.GSSUtil;

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

            int[] arr1 = new int[str.length()];
            int[] arr2 = new int[str.length()];

            if (str.length() == 1) {
                groupWord++;
                continue;
            }
            //happy 잘못됨..
            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k)) {
                        arr1[j]++; // 뒤에 같은 숫자가 나온 횟수
                    }
                }
            }
            //여기 for문이 잘못된거같은데
            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 1; k <= arr1[j]; k++) {
                    if (str.charAt(j) == str.charAt(k))
                        arr2[j]++;
                    else arr2[j]--;
                    // 뒤이어 같은 숫자가 나오면 ++ 아니면 --
                }
            }
            if (Arrays.toString(arr1).equals(Arrays.toString(arr2)))
                groupWord++;
        }
        System.out.println(groupWord);

    }
}
