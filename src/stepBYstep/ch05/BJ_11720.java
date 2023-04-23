package stepBYstep.ch05;

import java.util.Scanner;

public class BJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int result = 0;

        String str = sc.nextLine();
        for (int i = 0; i < num; i++) {
            result += str.charAt(i) - 48;
        }
        System.out.println(result);
    }
}
