package weeks.week3_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        input = input.replace("-", " - ");
        input = input.replace("+", " + ");

        String[] arr = input.split(" ");
        int result = 0;

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
//            arr[i] 가 "+"
            if (arr[i].equals("+")) continue;

//            arr[i] 가 "-"
            else if (arr[i].equals("-")) {
                while (i != arr.length - 1) {
                    i++;

                    if (arr[i].equals("-")) {
                        i--;
                        break;
                    }
                    else if (arr[i].equals("+")) continue;

                    else result -= Integer.parseInt(arr[i]);
                }
                if (i == arr.length - 1) {
                    break;
                }
            }
//            arr[i]가 숫자
            else result += Integer.parseInt(arr[i]);
        }
        System.out.println(result);
    }
}


