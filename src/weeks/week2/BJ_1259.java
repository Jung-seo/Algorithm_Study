package weeks.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1259

public class BJ_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String str;

        while (!(str = br.readLine()).equals("0")) {
            //sb 뒤집고 문자열로 비교
            if (sb.append(str).reverse().toString().equals(str))
                sb2.append("yes" + "\n" );
            else sb2.append("no" + "\n");
            sb.delete(0, sb.length());
        }
        System.out.println(sb2);
    }
}
