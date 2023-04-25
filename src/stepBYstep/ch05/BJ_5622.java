package stepBYstep.ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int timer = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'C')
                timer += 3;
            if (str.charAt(i) >= 'D' && str.charAt(i) <= 'F')
                timer += 4;
            if (str.charAt(i) >= 'G' && str.charAt(i) <= 'I')
                timer += 5;
            if (str.charAt(i) >= 'J' && str.charAt(i) <= 'L')
                timer += 6;
            if (str.charAt(i) >= 'M' && str.charAt(i) <= 'O')
                timer += 7;
            if (str.charAt(i) >= 'P' && str.charAt(i) <= 'S')
                timer += 8;
            if (str.charAt(i) >= 'T' && str.charAt(i) <= 'V')
                timer += 9;
            if (str.charAt(i) >= 'W' && str.charAt(i) <= 'Z')
                timer += 10;
        }
        System.out.println(timer);
    }
}
