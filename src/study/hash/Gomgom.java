package study.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//https://www.acmicpc.net/status?user_id=jungseo&problem_id=25192&from_mine=1
public class Gomgom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < count; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                set.clear();
            } else if (!set.contains(input)) {
                set.add(input);
                answer++;
            }
        }

        System.out.println(answer);
    }
}
