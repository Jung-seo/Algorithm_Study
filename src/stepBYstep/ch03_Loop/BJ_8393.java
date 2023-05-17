package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        int a = 0;

        for (int i=0; i<n; i++) {
            arr[i] = i + 1;
        }
        for (int i=0; i<n; i++) {
            a = a + arr[i];
        }
        System.out.println(a);
    }
}
