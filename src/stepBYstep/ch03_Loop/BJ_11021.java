package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a +b;
        }
        int i = 0;
        while (i < n) {
            System.out.println("Case #" + (i + 1) + ": " + arr[i]);
            i++;
        }
    }
}
