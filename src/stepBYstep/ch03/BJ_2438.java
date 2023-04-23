package stepBYstep.ch03;

import java.util.Scanner;

public class BJ_2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = 0;
        int r = 0;

        while (c < n) {
            while (r <= c) {
                System.out.print("*");
                r++;
            }
            r = 0;
            c++;
            if (c == n)
                return;
            System.out.print("\n");
        }
    }
}
