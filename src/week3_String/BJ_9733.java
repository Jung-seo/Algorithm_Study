package week3_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] works = new double[7];
        String[] worksName = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};

        String str = "";
        int countWorks = 0;

        while((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            countWorks += countWorks + st.countTokens();

            while(st.hasMoreTokens()) {
                switch (st.nextToken()) {
                    case "Re":
                       works[0]++;
                        break;
                    case "Pt":
                        works[1]++;
                        break;
                    case "Cc":
                        works[2]++;
                        break;
                    case "EA":
                        works[3]++;
                        break;
                    case "Tb":
                        works[4]++;
                        break;
                    case "Cm":
                        works[5]++;
                        break;
                    case "Ex":
                        works[6]++;
                        break;
                }
            }
        }
        for (double work : works) {
            System.out.printf("%.0f %.2f", work, work / countWorks);
        }
    }
}
