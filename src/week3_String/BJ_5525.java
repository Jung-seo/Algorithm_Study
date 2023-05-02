package week3_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numO = Integer.parseInt(br.readLine());
        br.readLine();
        String str = br.readLine();

        String[] arr = str.split("I");

        int count = 0;
//i + N - 1 까지 반복되는 O의 횟수.. 구현을...
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("O") && arr[i + 1].equals("O")) count++;
        }
        System.out.println(count);
    }
}
