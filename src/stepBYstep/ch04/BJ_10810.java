package stepBYstep.ch04;

import java.util.Scanner;
public class BJ_10810 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //배열 길이
        int length = sc.nextInt();
        int arr[] = new int[length];
        //공 넣는 횟수
        int m = sc.nextInt();
        //공 넣을 때마다 +1
        int count = 0;

        while (count < m) { // i 부터 j 까지 k번 공을 넣고
            int i = sc.nextInt() -1;
            int j = sc.nextInt() -1;
            int k = sc.nextInt();
            while (i <= j) {
                arr[i] = k;
                i++;
            }
            count++;
        }
        for (int i=0; i<length; i++) {
            System.out.println(arr[i]);
        }
    }
}
