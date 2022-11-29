package bj10996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase * 2; i++) {
            if (testCase == 1) {
                sb.append("*");
                break;
            }
            if ((i + 1) % 2 != 0 && (testCase % 2 == 0)) {
                sb.append("* ".repeat(testCase / 2)).append("\n");
            } else if ((i + 1) % 2 == 0 && (testCase % 2 == 0)) {
                sb.append(" *".repeat(testCase / 2)).append("\n");
            }
            if ((i + 1) % 2 != 0 && (testCase % 2 != 0)) {
                sb.append("* ".repeat(testCase / 2 + 1)).append("\n");
            } else if ((i + 1) % 2 == 0 && (testCase % 2 != 0)) {
                sb.append(" *".repeat(testCase / 2)).append("\n");
            }

        }
        System.out.print(sb);
    }
}
