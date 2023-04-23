package stepBYstep.ch01;

import java.util.Scanner;

public class BJ_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A * (B % 10));
        System.out.println(A * ((B / 10) % 10));
        System.out.println(A * (((B / 10) / 10) % 10));
        System.out.println(A * B);
    }
}
