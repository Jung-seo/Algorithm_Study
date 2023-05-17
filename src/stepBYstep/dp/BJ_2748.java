package stepBYstep.dp;

import java.util.Scanner;

public class BJ_2748 { // 피보나치 수열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n + 1];

        System.out.print(fibonacci(n, arr));
    }
    static long fibonacci(int n, long[] arr) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (arr[n] != 0) return arr[n];

        arr[n] = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
        return arr[n];
    }
}
