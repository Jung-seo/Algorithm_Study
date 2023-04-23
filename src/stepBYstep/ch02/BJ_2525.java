package stepBYstep.ch02;

import java.util.Scanner;

public class BJ_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b + c >= 60) {
            a = a + ( (b + c) / 60 );
            b = (b + c) % 60;
            if (a >= 24)
                a = a % 24;
            System.out.println(a + " " + b);
        }
        else {
            b = b + c;
            System.out.println(a + " " + b);
        }
    }
}
