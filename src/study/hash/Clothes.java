package study.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

//https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Clothes {
    public static void main(String[] args) {

        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(clothes1));
        System.out.println(solution(clothes2));
    }

    static int solution(String[][] clothes) {

//        Map<옷 종류 / 개수>
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] dress : clothes) {
            map.put(dress[1], map.getOrDefault(dress[1], 0) + 1);
        }
        System.out.println(map);

//        옷 종류별 개수 배열
        Integer[] cloth = map.values().toArray(new Integer[0]);
        System.out.println(Arrays.toString(cloth));

        return Stream.of(cloth).map(e -> e + 1).reduce(1, (a, b) -> a * b) - 1;
    }
}
