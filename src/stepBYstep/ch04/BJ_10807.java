package stepBYstep.ch04;

import java.util.Scanner;

public class BJ_10807 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int length = sc.nextInt();
        int arr[] = new int[length];

        for (int i=0; i<length; i++) {
            arr[i] = sc.nextInt();
        }

        int count_this = sc.nextInt();

        for (int i=0; i<length; i++) {
            if (arr[i] == count_this)  {
                count++;
            }
        }
        System.out.println(count);
    }
}