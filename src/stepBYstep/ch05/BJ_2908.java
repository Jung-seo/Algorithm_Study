package stepBYstep.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        //sb에 넣고 뒤집고 문자열로 변환
        str = sb.append(str).reverse().toString();

        StringTokenizer st = new StringTokenizer(str);

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        if (num1 - num2 > 0) {
            System.out.println(num1);
        } else System.out.println(num2);

    }
}
