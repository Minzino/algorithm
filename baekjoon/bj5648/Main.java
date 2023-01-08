package bj5648;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCase = sc.nextInt();
        long[] arr = new long[1000000];

        for (int i = 0; i < testCase; i++) {
            sb.append(sc.nextLong());
            sb.reverse();
            arr[i] = Long.parseLong(sb.toString());
        }

        Arrays.sort(arr, 0, testCase);

        for (int i = 0; i < testCase; i++) {
            System.out.println(arr[i]);
        }
    }
}
