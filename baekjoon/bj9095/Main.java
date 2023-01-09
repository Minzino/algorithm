package bj9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        int[] arr = new int[11];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(br.readLine());
            sb.append(arr[number]).append("\n");
        }
        System.out.println(sb);
    }

}
