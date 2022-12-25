package bj10816;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int mx = 10000000;
        int[] arr = new int[mx * 2 + 1];

        int testCase1 = sc.nextInt();
        for (int i = 0; i < testCase1; i++) {
            arr[sc.nextInt() + mx]++;
        }

        int testCase2 = sc.nextInt();
        for (int i = 0; i < testCase2; i++) {
            sb.append(arr[sc.nextInt() + mx]).append(" ");
        }
        System.out.print(sb);
    }

}
