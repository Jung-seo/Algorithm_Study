package stepBYstep.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1546 {
    public static void main (String[] args) {
        //double a = (double) 50 / 70;
        //System.out.println(a);
        Scanner sc = new Scanner(System.in);

        double result = 0;

        double[] arr = new double[sc.nextInt()];

        //점수 입력
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //오름 차순 정렬
        Arrays.sort(arr);

        double max = arr[arr.length-1];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (double) arr[i] / max * 100;
        }
        for (int i=0; i<arr.length; i++) {
            result += arr[i];
        }
        System.out.println((double) result/arr.length);
    }
}
