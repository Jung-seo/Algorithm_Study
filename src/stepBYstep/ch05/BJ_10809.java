package stepBYstep.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] alphabet = new char[26];
        int[] alphabet_locate = new int[26]; // 문자열에서 해당 알파벳 나온 자릿수

        for (int i = 0; i < 26; i++) { // 알파벳 배열 생성
            alphabet[i] = (char) (i + 97);

            for (int j = 1; j < str.length(); j++) { // 문자열 j인덱스와 알파벳 i인덱스가 같을 경우
                if (alphabet[i] == str.charAt(j)) { // 자리수 기록하는 배열 i인덱스에 문자열 인덱스 저장
                    alphabet_locate[i] = j;
                    break;
                }
            }
        }
        //첫번째 나온 알파벳 자리 인덱스 = 0
        //외에 0인 인덱스는 -1로
        for (int i = 0; i < 26; i++) {
            if (str.charAt(0) == alphabet[i])
                alphabet_locate[i] = 0;
            else if (alphabet_locate[i] == 0) {
                alphabet_locate[i] = - 1;
            }
        }
        str = Arrays.toString(alphabet_locate);
        str = str.replace("[", "").replace("]", "").replace(",", "");
        System.out.println(str);
    }
}
