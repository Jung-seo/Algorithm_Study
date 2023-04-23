package stepBYstep.ch03;

import java.util.Scanner;

public class BJ_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a + b;
        }
        for (int i=0; i<n; i++) {
            int c = arr[i];
            System.out.println(c);
        }
    }
}
