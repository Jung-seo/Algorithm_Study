package stepBYstep.recursion;

import java.util.Scanner;

public class BJ_27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(factorial(sc.nextLong()));
    }
    static long factorial(long num) {
        if (num <= 0) return 1;

        return num * factorial(num - 1);
    }
}
