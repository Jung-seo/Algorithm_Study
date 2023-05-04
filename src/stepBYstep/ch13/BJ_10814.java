package stepBYstep.ch13;

import java.util.*;
import java.util.stream.Collectors;

public class BJ_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        HashMap<String, Integer> memberInfo = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            int age = sc.nextInt();
            String name = sc.nextLine();

            memberInfo.put(name, age);
        }

//        value 정렬 후 같은 value 있을때 그 안에서 key로 정렬 외않되
        memberInfo
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()
                                .thenComparing(Map.Entry.comparingByKey()))
//                                .Comparator<Entry<K, V>>
//                            .thenComparing(Map.Entry.comparingByKey()))
                .forEach(el -> System.out.println(el.getValue() + " " + el.getKey()));

    }
}
//       sort a map by both keys and values
//
//       1. Get all entries by calling entrySet() method of Map.
//       2. Create a custom Comparator to sort entries based upon values.
//       3. Convert entry set to list.
//       4. Sort entry list by using Collections. sort() method by passing your value comparator.
//       5. Create a LinkedHashMap by adding entries in sorted order.
