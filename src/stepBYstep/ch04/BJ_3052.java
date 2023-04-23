package stepBYstep.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_3052 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;

        for (int i=0; i<10; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        Arrays.sort(arr);

        for (int i=0; i<9; i++) {
            if (arr[i] != arr[i+1]) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(count);
            return;
        }
        System.out.println(count+1);
    }
}
