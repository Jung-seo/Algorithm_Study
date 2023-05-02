package week3_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class BJ_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        String[] bookName = new String[cases];

        TreeMap<String, Integer> map = new TreeMap<>();

        int count = 0;

        for (int i = 0; i < cases; i++) {
            bookName[i] = br.readLine();
        }
//        배열에 책 이름 담고
        for (int i = 0; i < cases; i ++) {
            for (int j = 0; j < cases; j++) {
                if (bookName[i].equals(bookName[j])) {
                    count++;
                }
            }
//            트리맵에 <책이름, 수량> 넣고
            map.put(bookName[i], count);
            count = 0;
        }
        int max = 0;
        String needThisBook = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                needThisBook = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println(needThisBook);
    }
}
