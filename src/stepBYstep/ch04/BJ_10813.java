package stepBYstep.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 배열 길이
        int n = sc.nextInt(); // 바꿀 횟수
        int count = 0;        // 바꾼 횟수
        int arr[] = new int[m];

        for (int i = 0; i < m; i++) { // 공 투입
            arr[i] = i + 1;
        }
        while (count < n) {
            int i = sc.nextInt()-1; // 이 인덱스 공과
            int j = sc.nextInt()-1; // 이 인덱스 공을 바꿔....
            int outOfBox;
            outOfBox = arr[i];
            arr[i] = arr[j];
            arr[j] = outOfBox;
            count++;
        }
        for (int i=0; i<m; i++) {
            System.out.println(arr[i]);
        }
    }
}
