package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_15552 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*   시간 초과 뜨는 코드


        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a + b;
        }
        int i = 0;
        while (i < n) {
            System.out.println(arr[i]);
            i++;
        }

         */
        StringBuilder stringBuilder = new StringBuilder();

        int testCount = scanner.nextInt();

        while (testCount > 0) {
            stringBuilder.append((scanner.nextInt() + scanner.nextInt()) + "\n");
            testCount--;
        }
        System.out.println(stringBuilder);
    }
}
