package programmers.lv2;

// https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(Solution.solution( " for the last week "));
    }
}

class Solution {
    public static String solution(String s) {

        StringBuilder sb = new StringBuilder();

        String arr[] = s.split(" ");
        System.out.println(arr.length);

        for (String str : arr) {
            char cArr[] = str.toLowerCase().toCharArray();

            if (cArr.length == 0) {
                sb.append(" ");
                continue;
            }

            if (cArr[0] >= 97 && cArr[0] <= 122 ) {
                cArr[0] -= 32;
            }

            sb.append(String.valueOf(cArr)).append(" ");
        }

        if (s.charAt(s.length() - 1) != 32) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}