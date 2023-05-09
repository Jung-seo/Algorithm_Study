package week3_String;

import java.io.IOException;
import java.util.*;


public class BJ_5635 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < people; i++) {
            String name = sc.next();

            String birth = sc.nextLine();
            String[] arr = birth.split(" ");

            for (int j = 0; j < 3; j++) {
                arr[j].replace(" ", "");
                if (arr[j].length() == 1) arr[j] = "0" + arr[j]; // 1자리 숫자면 앞에 0 추가
            }
            //연 월 일 순으로 만들고
            String temp = arr[1];
            arr[1] = arr[3];
            arr[3] = temp;

            String str = Arrays.toString(arr).replace(" ", "").replace("[", "").replace("]", "").replace(",", "");
            int intBirth = Integer.parseInt(str);

            map.put(name, intBirth);
        }

        int max = 19891231;
        String youngest = "";
        int min = 20110101;
        String oldest = "";

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                oldest = entry.getKey();
            }
            if (entry.getValue() > max){
                max = entry.getValue();
                youngest = entry.getKey();
            }
        }
        System.out.println(youngest);
        System.out.println(oldest);
    }
}
