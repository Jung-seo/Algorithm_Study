package study.hash;

import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/42576
public class Marathon {
    public static void main(String[] args) {

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};

        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant1, completion1));
        System.out.println(solution(participant2, completion2));
        System.out.println(solution(participant3, completion3));
    }

    static String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                answer = name;
            }
        }
        return answer;
    }
}
