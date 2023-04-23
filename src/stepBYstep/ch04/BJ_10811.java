package stepBYstep.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_10811 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        int testCase = sc.nextInt();

        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        for (int i=0; i<testCase; i++) {
            int a = sc.nextInt() - 1; // 여기 인덱스부터
            int b = sc.nextInt() - 1; // 여기 까지

            //역순으로 바꿔야 하는 부분을 다른 배열로
            int[] otherBox = new int[b-a+1];

            int b1 = b;
            //otherBox에 역순으로 담고
            for (int j=0; j<b-a+1; j++) {
                otherBox[j] = arr[b1];
                b1--;
            }

            int a1 = a;
            //otherBox에서 arr에 순서대로 담고
            for (int j=0; j<b-a+1; j++) {
                arr[a1] = otherBox[j];
                a1++;
            }
        }

        String str = Arrays.toString(arr).replace(",", "");
        str = str.replace("[", "").replace("]", "");
        System.out.println(str);
    }
}
