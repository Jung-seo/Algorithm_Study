package stepBYstep.ch04;

import java.util.Scanner;

public class BJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 길이 입력
        int length = sc.nextInt();
        int arr[] = new int[length];
        int max = -10000001;
        int min = 1000001;

        //인덱스 채우고
        for (int i=0; i<length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}