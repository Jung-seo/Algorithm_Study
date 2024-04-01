package others;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        피보나치 수열 2000 보다 작고 가장 가까운 수
//        해당 수 까지의 합

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

//        fibonacci(2, list);

        int idx = 2;
        int result = 1;
        while (list.get(list.size() - 1) < 2000) {
            int next = list.get(idx - 1) + list.get((idx - 2));
            result += next;
            list.add(next);
            idx++;
        }
        int remove = list.get(list.size() - 1);
        list.remove(list.get(list.size() - 1));
        result -= remove;

        System.out.println(list.get(list.size() - 1));
        System.out.println(result);
    }

    static void fibonacci(int n, List<Integer> list) {
        list.add(list.get(n - 1) + list.get(n - 2));

        if (2000 < list.get(n)) {
            list.remove(n);
            System.out.println(list.get(n - 1));
            System.out.println(list.stream().mapToInt(e -> e).sum());
            return;
        } else {
            fibonacci(n + 1, list);
        }
    }
}
