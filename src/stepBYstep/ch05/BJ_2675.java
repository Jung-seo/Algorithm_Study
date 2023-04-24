package stepBYstep.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ_2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testcase = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testcase; i++) {
            int num = sc.nextInt();
            sc.nextLine();

            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
               sb.append(str.substring(j).repeat(num - 1));
            }
        }
        System.out.println(sb);
    }
}
