package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1157_overtime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max_index = 0;
        int max = 0;

        String str = br.readLine().toUpperCase();
        int[] alph = new int[str.length()];
        int[] alph2 = new int[str.length()];

        if (str.length() == 1) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    alph[i]++;
                }
            }
        }
        System.arraycopy(alph, 0, alph2, 0, str.length());
        Arrays.sort(alph2);

        if (alph2[alph2.length-1] == alph2[alph2.length-2]) {
            System.out.println("?");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (alph[i] > max){
                max = alph[i];
                max_index = i;
            }
        }
        System.out.println(str.charAt(max_index));
    }
}
