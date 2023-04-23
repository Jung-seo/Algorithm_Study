package stepBYstep.ch02;

import java.util.Scanner;

public class BJ_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b<45) {
            a = a - 1;
            b = b + 15;
            if (a == -1)
                a = 23;
            System.out.println(a + " " + b);

        }
        else {
            b = b -45;
            System.out.println(a + " " + b);
        }
    }
}
