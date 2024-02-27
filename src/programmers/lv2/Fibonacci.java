package programmers.lv2;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 5;

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        System.out.println(fibonacci(n, arr));

    }
    static int fibonacci(int i, int[] arr) {
        if (i > 1 && arr[i] == 0) {
            arr[i] = fibonacci(i - 1, arr) + fibonacci(i - 2, arr);
        }
        return arr[i] % 1234567;
    }
}
