package stepBYstep.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_10951 {
    public static void main (String[] arg) throws IOException {
/*
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();


        while (sc.hasNext()) {
            int a = sc.nextInt() + sc.nextInt();

            stringBuilder.append(a).append("\n");
        }
        System.out.println(stringBuilder);
*/
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
