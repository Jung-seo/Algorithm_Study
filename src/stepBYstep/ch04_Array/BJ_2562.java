package stepBYstep.ch04_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        int max = 0;
        int num = 0;

        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i=0; i<9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                num = i + 1;
            }
        }
        System.out.println(max + "\n" + num);
    }
}
