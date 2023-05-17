package stepBYstep.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = "-".repeat(squares(3, n));

    }
    static int squares(int number, int count) {
        if (count == 0) return 1;

        return 3 * squares(number, count - 1);
    }
    static String makeSpace(String str) {
        if (str.length() == 1) return str;
        String space = " ".repeat(str.length());
        return null;
    }
}
