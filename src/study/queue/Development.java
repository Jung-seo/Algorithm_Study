package study.queue;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42586
public class Development {
    public static void main(String[] args) {

        int[] progresses1 = {93, 30, 55};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};

        int[] speeds1 = {1, 30, 5};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(progresses1, speeds1)));
        System.out.println(Arrays.toString(solution(progresses2, speeds2)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> progressQue = new LinkedList<>();
        Queue<Integer> speedQue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            progressQue.add(progresses[i]);
            speedQue.add(speeds[i]);
        }

        int days = 1;
        int deploy = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (list.stream().mapToInt(e -> e).sum() != progresses.length) {
            if (!progressQue.isEmpty() && !speedQue.isEmpty() && progressQue.peek() + speedQue.peek() * days >= 100) {
                progressQue.poll();
                speedQue.poll();
                deploy++;
            } else {
                if (deploy != 0) {
                    list.add(deploy);
                    deploy = 0;
                }
                days++;
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
