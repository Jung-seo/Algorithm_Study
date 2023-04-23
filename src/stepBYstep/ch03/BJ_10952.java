package stepBYstep.ch03;

import java.util.Scanner;

public class BJ_10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 1;
        int arr[] = new int[100];

        arr[0] = a + b;
        for (int i=1; i<100; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n++;
            arr[i] = a + b;
            if (a == 0 && b == 0)
                break;
        }
        for(int I=0; I<n; I++) {
            if (arr[I] == 0)
                return;
            System.out.println(arr[I]);
        }
    }
}
