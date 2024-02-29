package study.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//https://www.acmicpc.net/problem/2002
public class Overtaking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int overtaking = 0;

        List<String> cars = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            cars.add(br.readLine());
        }

        while (!cars.isEmpty()) {
            String car = br.readLine();

            if (!cars.get(0).equals(car)) {
                overtaking++;
            }
            cars.remove(car);
        }

        System.out.println(overtaking);
    }
}
