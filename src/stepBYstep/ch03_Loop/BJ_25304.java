package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a * b;
        }
        int p = 0;
        for (int i=0; i<n; i++) {
            p = p + arr[i];
        }
        if (p == price) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
