package programmers.lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12924

public class Finn {
    public static void main(String[] args) {
        int n = 3;
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            int sum = i;

            for (int j = i + 1; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
