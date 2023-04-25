package stepBYstep.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10951_BR {
    public static void main (String[] arg) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        while ((str = br.readLine()) != null) {

            StringTokenizer st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b + "\n");
        }
        System.out.println(sb);
    }
}
