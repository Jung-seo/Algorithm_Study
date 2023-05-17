package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int space = n;
        int star = 1;
        int line = 1;

        while (line <= n) {
            while (space > line) {
                System.out.print(" ");
                space--;
            }
            while (star <= line) {
                System.out.print("*");
                star++;
            }
            line++;
            space = n;
            star = 1;
            if (line > n)
                return;
            System.out.print("\n");
        }
    }
}
