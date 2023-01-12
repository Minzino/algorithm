package bj11501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        long[] answer = new long[testCase];
        for (int n = 0; n < testCase; n++) {
            int days = Integer.parseInt(br.readLine());
            long[] stocks = new long[days];
            long max = Long.MIN_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < days; i++) {
                stocks[i] = Long.parseLong(st.nextToken());
            }
            for (int i = days - 1; i >= 0; i--) {
                if (stocks[i] > max) {
                    max = stocks[i];
                } else {
                    answer[n] += (max - stocks[i]);
                }
            }
        }
        for (long result : answer) {
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
