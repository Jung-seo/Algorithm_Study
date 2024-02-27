package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12981

public class WordChain {
    public static void main(String[] args) {

        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank", "wheel"};
        int n = 3;

        List<String> used = new ArrayList<>();
        used.add(words[0]);

        int[] answer = new int[2];

        for (int i = 1; i < words.length; i++) {
            String s = used.get(i - 1);

            if (s.charAt(s.length() - 1) != words[i].charAt(0) || used.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            used.add(words[i]);
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
