package week4_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        String[] arr = str.split("<");

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i].endsWith(">"))
        }
    }
}
