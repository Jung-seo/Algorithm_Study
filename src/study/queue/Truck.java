package study.queue;

import java.util.*;

public class Truck {
    public static void main(String[] args) {
        int bridge_length1 = 2;
        int weight1 = 10;
        int[] truck_weight1 = {7, 4, 5, 6};

        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weight2 = {10};

        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weight3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        System.out.println(solution(bridge_length1, weight1, truck_weight1));
        System.out.println(solution(bridge_length2, weight2, truck_weight2));
        System.out.println(solution(bridge_length3, weight3, truck_weight3));
    }
    static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int cross = 0;
        int onBrigdeWeight = 0;
        Queue<Integer> onBridge = new LinkedList<>();
        List<Integer> trucks = new ArrayList<>();

        Arrays.sort(truck_weights);
        for (int i = 0; i < truck_weights.length; i++) {
            trucks.add(truck_weights[i]);
        }

        while (cross != truck_weights.length) {
            System.out.println(trucks);
            if (onBridge.isEmpty() || onBrigdeWeight + trucks.get(trucks.size() - 1) <= weight) {

                onBridge.add(trucks.get(trucks.size() - 1));
                onBrigdeWeight += trucks.get(trucks.size() - 1);
                answer++;
                trucks.remove(trucks.size() - 1);
            }

            while (!trucks.isEmpty() && onBrigdeWeight + trucks.get(0) <= weight && onBridge.size() < bridge_length) {
                System.out.println(trucks);
                if (onBrigdeWeight + trucks.get(0) <= weight) {
                    onBridge.add(trucks.get(0));
                    onBrigdeWeight += trucks.get(0);
                    answer++;
                    trucks.remove(0);
                }
            }
            System.out.println("in the Queue : " + onBridge);

            if (onBridge.size() < bridge_length) {
                answer += bridge_length - onBridge.size();
            }
            onBrigdeWeight -= onBridge.poll();
            answer++;
            cross++;

        }
        return answer;
    }
}
