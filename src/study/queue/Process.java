package study.queue;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Process {
    public static void main(String[] args) {
        int[] priorities1 = {2, 1, 3, 2};
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int[] priorities3 = {2, 3, 1, 2};


        System.out.println(solution(priorities1, 2));
        System.out.println(solution(priorities2, 0));
        System.out.println(solution(priorities3, 2));
    }

    static int solution(int[] priorities, int location) {
        Queue<Integer> que1 = new LinkedList<>();

        for (int priority : priorities) {
            que1.add(priority);
        }

        int order = 1;
        int idx = 0;
        while (!que1.isEmpty()) {
            if (idx == priorities.length) {
                idx -= priorities.length;
            }
            System.out.println(que1);
//            현재 프로세스 우선 순위가 가장 높지 않은 경우
            if (que1.stream().anyMatch(e -> que1.peek() < e)) {
                que1.add(que1.poll());
            }

//            현재 프로세스 우선순위가 가장 높은 경우
            else {
                que1.poll();
                que1.add(-1);
                if (idx == location) {
//                    return order;
                    return order;
                }
                order++;
            }
            idx++;
        }
        return -1;
    }
}
