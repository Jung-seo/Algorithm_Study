package stepBYstep.ch05_String;

import java.util.Scanner;

public class BJ_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();

            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1) + "\n");
        }
        System.out.println(sb);
    }
}
