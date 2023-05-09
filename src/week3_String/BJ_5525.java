package week3_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BJ_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numO = Integer.parseInt(br.readLine());
        br.readLine();

        String str = br.readLine();

        int start = 0;
        int finish = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'O') start++;
            else break;
        }
        for (int i = finish;  0< i; i--) {
            if (str.charAt(i) == 'O') finish--;
            else break;
        }

        str = str.substring(start, finish);

        long result = 0;

//        I를 기준으로 스플릿하고 처음 입력받는 N을 리스트에 넣고
        String[] arr = str.split("I");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(numO);

        int count = 0;

//        O로만 이루어진 배열에서  단일한 O뒤로 단일한 O로 이루어진 문자열이 연속되는 횟수를 count에 담아서 리스트 넣고
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("O")) count = 1;
            else count = 0;

//            O혼자 있는 문자열이 끝나면 break 후 다음 문자열부터 다시 시작
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals("O") && arr[i].equals(arr[j])) count++;
                else break;
            }
//            리스트에는 O가 연속으로 나온 횟수
            list.add(count);
            count = 0;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

//        3 IOIOIOI

//        처음 입력받은 N 이상으로 연속된 부분 필터링
//        N 제외 하고 남은 수 카운트
        result = list
                .stream()
                .filter(el -> list.get(0) <= el)
                .skip(1)
                    .peek(el -> System.out.print(el + "\n"))
                .count();

        System.out.println(result);
    }
}
