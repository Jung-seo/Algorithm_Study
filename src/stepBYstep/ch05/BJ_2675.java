package stepBYstep.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ_2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int num = sc.nextInt();
            // 여기서 공백이 생기는데
            // sc.nextLine() 넣으면 정상 작동을 안해...
            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
                sb.append(Character.toString(str.charAt(j)).repeat(num));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().replace(" ", ""));
    }
}
