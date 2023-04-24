package stepBYstep.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[28];

        int check1 = 0;
        int check2 = 0;

        for (int i=0; i<28; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순 정렬

        for (int i=0; i<28; i++) {
            if (i == 27) {
                check1 = 28;
                check2 = 28;
                break;
            }
            if (arr[i] != i+1) {
                check1 = i;  // i +1 == 첫번째 없는 번호
                break;
            }
        }
        for (int i=check1; i<28; i++) {
            if (i == 27) {
                check2 = 28;
                break;
            }
            if (arr[i] != i+2) {
                check2 = i; // i+ 2 == 두번째 없는 번호
                break;
            }
        }
        System.out.println(check1+1);
        System.out.println(check2+2);
    }
}