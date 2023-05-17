package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_10951_scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        while (sc.hasNext()) {
            int a = sc.nextInt() + sc.nextInt();

            sb.append(a).append("\n");
        }
        System.out.println(sb);

    }
}