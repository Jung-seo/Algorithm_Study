package weeks.week3_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        String findNemo = "";

        while(!(str = br.readLine()).equals("EOI")) {
            StringTokenizer st = new StringTokenizer(str);

            while (st.hasMoreTokens()) {
                if (st.nextToken().toLowerCase().replace(",", "").equals("nemo")) {
                    findNemo = "Found";
                    break;
                } else findNemo = "Missing";
            }
            sb.append(findNemo + "\n");
        }
        System.out.println(sb);
    }
}
