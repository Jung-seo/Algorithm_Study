package study.hash;

import java.util.*;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/42579
public class BestAlbum {
    public static void main(String[] args) {

        String[] genres1 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays1 = {500, 600, 150, 800, 2500};

        String[] genres2 = {"classic", "classic", "classic", "pop", "pop"};
        int[] plays2 = {600, 600, 150, 600, 700};

        String[] genres3 = {"classic", "classic", "classic", "classic", "pop"};
        int[] plays3 = {50, 60, 100, 30, 8000};

        System.out.println(Arrays.toString(solution(genres1, plays1)));
        System.out.println(Arrays.toString(solution(genres2, plays2)));
        System.out.println(Arrays.toString(solution(genres3, plays3)));
    }

    static int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

//        Map<장르, 총 플레이 수>
        Map<String, Integer> genresPlay = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            genresPlay.put(genres[i], genresPlay.getOrDefault(genres[i], 0) + plays[i]);
        }

//        총 플레이 수가 많은 순으로 정렬 / List<해당 장르 총 재생 수>
        List<Integer> orderedPlay = genresPlay.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

//        총 플레이 수가 많은 장르 순 정렬 / List<장르>
        List<String> orderedGenre = new ArrayList<>();
        for (Integer play : orderedPlay) {
            orderedGenre.add(getKey(genresPlay, play));
        }

        System.out.println(orderedGenre);

        for (String genre : orderedGenre) {

            int bestPlay = 0;
            int bestIdx = -1;
            int secondPlay = 0;
            int secondIdx = -1;

            for (int j = 0; j < plays.length; j++) {
                if (genre.equals(genres[j])) {
                    if (plays[j] > bestPlay) {
                        secondPlay = bestPlay;
                        secondIdx = bestIdx;
                        bestPlay = plays[j];
                        bestIdx = j;
                    } else if (plays[j] == bestPlay || plays[j] > secondPlay) {
                        secondPlay = plays[j];
                        secondIdx = j;
                    }
                }
            }
            answer.add(bestIdx);
            if (secondIdx > -1) {
                answer.add(secondIdx);
            }
        }

//        Integer List >> int[]
        int[] intAnswer = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            intAnswer[i] = answer.get(i);
        }
        return intAnswer;
    }

//    Map에서 Value로 Key 찾기
    static String getKey(Map<String, Integer> genresPlay, Integer plays) {
        for (Map.Entry<String, Integer> entry : genresPlay.entrySet()) {
            if (entry.getValue().equals(plays)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
