package week5_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/14713

public class BJ_14713 { // 앵무새
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Queue<String>> queList = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        int totalQueSize = 0; // 큐에 단어가 남았는데 문장이 끝났을 경우 체크용
        for (int i = 0; i < N; i++) {
            Queue<String> que = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                que.offer(st.nextToken());
            }
            totalQueSize += que.size();
            queList.add(que);
        }
        String L = br.readLine();
        StringTokenizer st = new StringTokenizer(L);
        while (st.hasMoreTokens()) {
            int pollCount = 0;
            String str = st.nextToken();;
            for (int i = 0; i < N; i++) {
                if (!queList.get(i).isEmpty() && queList.get(i).peek().equals(str)) {
                    queList.get(i).poll();
                    pollCount++;
                    totalQueSize--;
                }
            }
            if (pollCount == 0) {
                System.out.print("Impossible");
                return;
            }
        }
        if (totalQueSize != 0) {
            System.out.print("Impossible");
            return;
        }
        System.out.print("Possible");
    }
}
// N만큼 que를 생성 후 각 문장의 단어들을 해당 que에 삽입
// 검사하는 문장을 토큰화 해서 처음 토큰이 현재 존재하는 que 들의 다음 값들 중 있는지 확인
// 있으면 해당 큐 팝, 반복 -> 모든 큐가 비면 Possible 출력
// 없으면 Impossible 출력
