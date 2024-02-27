package programmers.lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12980

public class JumpTeleport {
    public static void main(String[] args) {

        int n = 5000;

        int answer = 1;

        while (n > 2) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                answer++;
                n--;
            }
        }

        System.out.println(answer);
    }
}
