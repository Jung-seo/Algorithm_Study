package week2;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2941

public class BJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                //c가 마지막 인덱스 일때
                if (i == str.length()-1) {
                    count++;
                    break;
                }
                //c뒤에 다른 문자가 있을때
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    count++;
                    i++;
                    continue;
                }
            }
            if (str.charAt(i) == 'd') {
                //d가 마지막 인덱스 일때
                if (i == str.length()-1) {
                    count++;
                    break;
                }
                //d 뒤에 '-' 가 있을떄
                if (str.charAt(i + 1) == '-') {
                    count++;
                    i++;
                    continue;
                }
                //d 뒤에 z가 나왔을때
                if (str.charAt(i + 1) == 'z') {
                    //d 다음 z가 마지막일때
                    if (i + 1 == str.length()-1) {
                        count += 2;
                        break;
                    }
                    //d 다음 z 다음 '=' 일때
                    if (str.charAt(i +2) == '=') {
                        count++;
                        i += 2;
                        continue;
                    }
                }
            }
            if (str.charAt(i) == 'l') {
                if (i == str.length()-1) {
                    count++;
                    break;
                }
                if (str.charAt(i + 1) == 'j') {
                    count++;
                    i++;
                    continue;
                }
            }
            if (str.charAt(i) == 'n') {
                if (i == str.length()-1) {
                    count++;
                    break;
                }
                if (str.charAt(i + 1) == 'j') {
                    count++;
                    i++;
                    continue;
                }
            }
            if (str.charAt(i) == 's') {
                if (i == str.length()-1) {
                    count++;
                    break;
                }
                if (str.charAt(i + 1) == '=') {
                    count++;
                    i++;
                    continue;
                }
            }
            if (str.charAt(i) == 'z') {
                if (i == str.length()-1) {
                    count++;
                    break;
                }
                if (str.charAt(i + 1) == '=') {
                    count++;
                    i++;
                    continue;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}

