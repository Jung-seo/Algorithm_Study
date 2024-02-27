package programmers.lv2;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class BinaryString {
    public static void main(String[] args) {

//        이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return
        String s = "01110";

        int[] answer = new int[2];

        while (!s.equals("1")) {

            int temp = s.length();

            s = s.replace("0", "");
            answer[1] += temp - s.length();

            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
