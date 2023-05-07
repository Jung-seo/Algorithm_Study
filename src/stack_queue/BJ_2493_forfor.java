package stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2493_forfor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int towerNum = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        Stack<Integer> stack = new Stack<>();

        while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));

        for (int i = list.size() - 1; 1 <= i; i--) {
            for (int j = i - 1; 0 <= j; j--) {
                if (list.get(i) <= list.get(j)) {
                    stack.add(j + 1);
                    break;
                }
                if (j == 0) stack.add(0);
            }
        }
        stack.add(0);

        while (!stack.empty()) System.out.print(stack.pop() + " ");
//        stack.forEach(el -> System.out.print(el + " "));

//        String[] arr = br.readLine().split(" ");
//        int[] result = new int[arr.length];
//
//        for (int i = arr.length - 1; 1 < i; i--) {
//            for (int j = i - 1; 0 < j; j--) {
//                if (Integer.parseInt(arr[i]) <= Integer.parseInt(arr[j])) {
//                    result[i] = j + 1;
//                    break;
//                }
//            }
//        }
//        for (int num : result)
//            System.out.print(num + " ");
    }
}
