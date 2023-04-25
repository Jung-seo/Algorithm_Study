package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1157
public class BJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max_index = 0;
        int max = 0;

        String str = br.readLine().toUpperCase();
        char[] alph = new char[26]; // 알파벳
        int[] alph_count = new int[26]; // 알파벳별 등장 횟수
        int[] alph_copy = new int[26]; // 횟수 배열 복사용

        if (str.length() == 1) {
            System.out.println(str);
            return;
        }
        // 알파벳 주입
        for (int i = 0; i < 26; i++)
            alph[i] = (char)(i + 65);
        //알파벳 나올때마다 횟수++
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (alph[i] == str.charAt(j))
                    alph_count[i]++;
            }
        }
        System.arraycopy(alph_count, 0, alph_copy, 0, 26);
        Arrays.sort(alph_copy);
        //최댓값 2개 이상 일때
        if (alph_copy[alph_copy.length-1] == alph_copy[alph_copy.length-2]) {
            System.out.println("?");
            return;
        }
        //최댓값일때 해당 인덱스 max에 저장
        for (int i = 0; i < 26; i++) {
            if (alph_count[i] > max){
                max = alph_count[i];
                max_index = i;
            }
        }
        System.out.println(alph[max_index]);
    }
}