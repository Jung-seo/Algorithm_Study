package study.hash;

//https://school.programmers.co.kr/learn/courses/30/lessons/42577
import java.util.Arrays;

public class PhoneBook {
    public static void main(String[] args) {

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};

        System.out.println(solution(phone_book1));
        System.out.println(solution(phone_book2));
        System.out.println(solution(phone_book3));
    }

    static boolean solution(String[] phone_book) {

        boolean answer = true;

/*        for (String phone : phone_book) {
            if (Stream.of(phone_book).filter(e -> e.length() > phone.length()).anyMatch(e -> e.startsWith(phone))) {
                answer = false;
            }
        }*/

        Arrays.sort(phone_book);

        for (int i = 1; i < phone_book.length; i++) {
            String temp = phone_book[i - 1];

            if (phone_book[i].charAt(0) != temp.charAt(0)) {
                continue;
            }
            if (phone_book[i].startsWith(temp)) {
                return false;
            }
        }
        return answer;
    }
}
