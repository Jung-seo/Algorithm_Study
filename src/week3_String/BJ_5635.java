package week3_String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_5635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[people][4];

        for (int i = 0; i < people; i++) {
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            for (int j = 0; j < 4; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        int oldestYear = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i][3]) > oldestYear) {
                oldestYear = Integer.parseInt(arr[i][3]);
            }

        }
    }
}
