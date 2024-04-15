package others;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        int n = 7;

//        star1(n);
//        star2(n);
//        star3(n);
//        star4(n);
        star5(n);
        star6(n);
    }

    public static void star1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = n; i < j; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; i < j; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = n; i < j; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void star3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; i < j; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void star4(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <  i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void star5(int n) {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - 2 - i; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star6(int n) {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = n - 2 - i; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
