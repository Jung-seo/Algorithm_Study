package stepBYstep.ch04;

import java.util.Scanner;

public class BJ_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int length = sc.nextInt();
        int arr[] = new int[length];
        int a = sc.nextInt();

        for (int i=0; i<length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < a) {
                sb.append(arr[i] + " ");
            }
        }
        System.out.println(sb);
    }
}