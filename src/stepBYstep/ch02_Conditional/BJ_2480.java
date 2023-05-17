package stepBYstep.ch02_Conditional;

import java.util.Scanner;

public class BJ_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[3];

        for (int i = 0; i < 3; i++)
            arr[i] = scanner.nextInt();

        if (arr[0] == arr[1] && arr[1] == arr[2])
            System.out.print(10000 + arr[0] * 1000);
        else if (arr[0] == arr[1])
            System.out.println((1000 + arr[0] * 100));
        else if (arr[1] == arr[2])
            System.out.println((1000 + arr[1] * 100));
        else if (arr[2] == arr[0])
            System.out.println((1000 + arr[2] * 100));
        else {
            int Max = arr[0];
            for (int i = 0; i < 3; i++) {
                if (arr[i] > Max)
                    Max = arr[i];
            }
            System.out.println(Max * 100);
        }
    }
}
