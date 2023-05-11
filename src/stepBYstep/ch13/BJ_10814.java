package stepBYstep.ch13;

import java.util.*;

public class BJ_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        LinkedHashMap<String, Integer> memberInfo = new LinkedHashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            int age = sc.nextInt();
            String name = sc.nextLine().trim();

            memberInfo.put(name, age);
        }
        memberInfo
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(el -> System.out.println(el.getValue() + " " + el.getKey()));

    }
}
