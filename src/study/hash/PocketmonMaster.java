package study.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//https://www.acmicpc.net/problem/1620
public class PocketmonMaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        HashMap<Integer, String> numName = new HashMap<>();
        HashMap<String, Integer> nameNum = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            numName.put(i, str);
            nameNum.put(str, i);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            if (nameNum.containsKey(input)) {
                sb.append(nameNum.get(input)).append("\n");
            } else {
                sb.append(numName.get(Integer.parseInt(input))).append("\n");
            }
        }

        System.out.print(sb.toString().trim());
    }
}
