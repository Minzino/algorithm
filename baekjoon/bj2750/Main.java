package bj2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        sort(testCase, arr);
        for (int i = 0; i < testCase; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }

    private static void sort(int testCase, int[] arr) {
        int tmp;

        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < testCase - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

}
