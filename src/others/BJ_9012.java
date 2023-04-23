package others;

import java.util.Scanner;

public class BJ_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCase = sc.nextInt();
        sc.nextLine();

        int judge = 0;

        for (int i = 0; i < testCase; i++) {
            String str = sc.nextLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(')
                    judge++;
                else judge--;

                if (judge < 0)
                    break;
            }
            if (judge < 0) {
                sb.append("NO" + "\n");
                judge = 0;
                continue;
            }
            if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
                if (judge == 0)
                    sb.append("YES" + "\n");
                else sb.append("NO" + "\n");
            } else sb.append("NO" + "\n");
            judge = 0;
        }
        System.out.println(sb);
    }
}
