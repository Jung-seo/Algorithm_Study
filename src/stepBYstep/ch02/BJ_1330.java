package stepBYstep.ch02;

import java.util.Scanner;

public class BJ_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A>B)
            System.out.println(">");
        if (A<B)
            System.out.println("<");
        if (A==B)
            System.out.println("==");
    }
}