package others;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.toLowerCase();
        int count = 1;
        int[] arr = new int[str.length()];
        //한자리일때 종료
        if (str.length() == 1) {
            System.out.println(str);
            return;
        }
        //각 자리별 중복되는 수를 arr배열에
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j)
                    continue;
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            arr[i] = count;
            count = 1;
        }
        //앞에서부터 비교해서 또 나오면 뒤에 알파벳 나왔던 수를 0으로
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (i == j)
                    continue;
                if (str.charAt(i) == str.charAt(j)) {
                    arr[j] = 0;
                }
            }
        }
        int[] arr2 = new int[str.length()];
        System.arraycopy(arr, 0, arr2, 0, str.length());
        Arrays.sort(arr2);
        if (arr2[str.length()-1] == arr2[str.length()-2]) {
            System.out.println("?");
            return;
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(str.charAt(maxIndex));
    }
}
