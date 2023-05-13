package others;

import java.util.Scanner;

public class BJ_1629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = sc.nextInt();
        int divide = sc.nextInt();

        System.out.println(multiple_recursion(num, count) % divide); // 메모리 초과..

/*        long result = 1;
        for (int i = 0; i < count; i++) {
            result *= num;
        }
        result %= divide;
        System.out.println(result);
*/
    }
    static long multiple_recursion(int num, int count) {
        if (count == 0) return 1;

        return num * multiple_recursion(num, count - 1);
    }

}
