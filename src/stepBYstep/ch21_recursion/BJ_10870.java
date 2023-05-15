package stepBYstep.ch21_recursion;

import java.util.Scanner;

public class BJ_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    static int fibonacci (int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
