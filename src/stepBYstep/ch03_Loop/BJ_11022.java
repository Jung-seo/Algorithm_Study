package stepBYstep.ch03_Loop;

import java.util.Scanner;

public class BJ_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
        int fir[] = new int[n];
        int sec[] = new int[n];

        for (int i=0; i<n; i++) {
            fir[i] = scanner.nextInt();
            sec[i] = scanner.nextInt();
            arr[i] = fir[i] + sec[i];
        }
        int i = 0;
        while (i < n) {
            System.out.println("Case #" + (i +1) + ": " + fir[i] + " + " + sec[i] + " = " + arr[i]);
            i++;
        }
    }
}
