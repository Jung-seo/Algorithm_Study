package study.hash;

//https://school.programmers.co.kr/learn/courses/30/lessons/1845
import java.util.HashSet;

public class Phonketmon {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2 ,4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
        System.out.println(solution(nums3));
    }

    public static int solution(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            }

        return Math.min(set.size(), nums.length / 2);
    }
}
