package stepBYstep.greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/13305

public class BJ_13305 { // 주유소 // 58점
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] dis = br.readLine().split(" ");
        String[] oil = br.readLine().split(" ");
        oil[oil.length - 1] = "1000000000";
        long totalPrice = 0;
        for (int i = 0; i < dis.length - 1; i++) {
            long curPrice = Long.parseLong(oil[i]);
            long nextPrice = Long.parseLong(oil[i + 1]);
            long distance = Long.parseLong(dis[i]); // 다음 도시까지 가야하는 거리

            if (curPrice > nextPrice) { // 다음 주유소 가격이 더 쌀때
                totalPrice += distance * curPrice;
            }
            else { // 지금 가격이 다음 가격보다 쌀때
                distance = 0; // j 인덱스 도시까지 가야하는 거리
                for (int j = i + 1; j < oil.length; j++) { // 더 싼 주유소가 나올때까지 거리를 더함
                    nextPrice = Long.parseLong(oil[j]); // 다음에 나올 기름 가격

                    if (nextPrice < curPrice || j == oil.length - 1) { // 더 싼 주유소가 나오거나 마지막까지
                        distance += Long.parseLong(dis[j - 1]);      // 비교했는데 지금이 제일 쌀때
                        break;                                         // j = i + 1 해서 인덱스 한칸씩 더 밀림
                    }
                    else distance += Long.parseLong(dis[j - 1]);
                    i++;
                }
                totalPrice += distance * curPrice;
            }
        }
        System.out.print(totalPrice);
    }
}
// 첫 주유소에서 가장 기름이 싼 주유소까지 갈만큼만 넣고 이동
// 가장 싼 주유소에서 끝까지 갈 수 있는 기름 채우고 종료
// 필요한 거리 int[] distance // 기름값 int[] oilPrice
// distance[1] 만큼의 기름 충전 -> distance의 남은 요소들 만큼 기름 충전