package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = n / 4;
        int b = 0;

        while (b < a) {
            System.out.print("long ");
            b++;
        }
        System.out.print("int");
    }
}
