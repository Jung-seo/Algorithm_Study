package study.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//https://www.acmicpc.net/problem/1620
public class PocketmonMaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(num[0]);
        int m = Integer.parseInt(num[1]);
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            if (!map.containsValue(input)) {
                sb.append(map.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(getKey(map, input)).append("\n");
            }
        }

        System.out.print(sb.toString().trim());
    }

    static Integer getKey(HashMap<Integer, String> map, String name) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                return entry.getKey();
            }
        }
        return null;
    }

    static Integer getKey1(HashMap<Integer, String> map, String name) {
        return map.entrySet().stream()
                .filter(e -> e.getValue().equals(name))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}
