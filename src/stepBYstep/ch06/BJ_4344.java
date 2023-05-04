package stepBYstep.ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BJ_4344 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(sc.nextLine());
        int people = 0;
        ArrayList<Double> scores = new ArrayList<>();
        ArrayList<Double> finalAverages = new ArrayList<>();


        for (int i = 0; i < testCase; i++) {
            people = sc.nextInt();
            double sum = 0;

            for (int j = 0; j < people; j++) {
                scores.add(sc.nextDouble());
            }
            for (Double d : scores) {
                sum = sum + d;
            }
            scores.add(0, sum / people); // scores 0 인덱스 = 평균점수
            int higherThanAverage = (int) scores.stream()
                    .mapToDouble(el -> el)
                    .skip(1)
                    .filter(el -> scores.get(0) < el)
                    .count();
            finalAverages.add((double) higherThanAverage / people * 100);
            scores.clear();
        }
        for (int i = 0; i < testCase; i++) {
            System.out.printf("%.3f%% \n", finalAverages.get(i));
        }
    }
}
