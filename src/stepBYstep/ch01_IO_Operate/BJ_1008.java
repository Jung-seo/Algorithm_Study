package stepBYstep.ch01_IO_Operate;

import java.util.Scanner;

public class BJ_1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        double C = (double) A / B;

        System.out.println(C);
    }
}
