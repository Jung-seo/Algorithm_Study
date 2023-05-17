package stepBYstep.ch06_Effective1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        double scoreSum = 0;

        ArrayList<Double> list = new ArrayList<>();

        while ((str = br.readLine()) != null) {

//            P/F 지나가고
            if (str.endsWith("P")) continue;

//            등급 변환
            str = str.replace("A+", "4.5");
            str = str.replace("A0", "4.0");
            str = str.replace("B+", "3.5");
            str = str.replace("B0", "3.0");
            str = str.replace("C+", "2.5");
            str = str.replace("C0", "2.0");
            str = str.replace("D+", "1.5");
            str = str.replace("D0", "1.0");
            str = str.replace("F", "0.0");

            String[] arr = str.split(" ");

//            리스트에 학점 * 등급
            list.add(Double.parseDouble(arr[1]) * Double.parseDouble(arr[2]));
//            학점 총합
            scoreSum += Double.parseDouble(arr[1]);

        }
        double result = list.stream()
                .mapToDouble(el -> el)
                .sum() / scoreSum;

        System.out.println(result);
    }
}
