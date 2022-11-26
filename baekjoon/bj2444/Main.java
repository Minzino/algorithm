package bj2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        char star = '*';
        for (int i = 1; i < testCase; i++) {
            for (int j = testCase - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                sb.append(star);
            }
            sb.append("\n");
        }

        for (int i = 1; i <= testCase; i++) {
            for (int j = i - 1; j > 0; j--) {
                sb.append(" ");
            }
            for (int k = 2 * testCase - (2 * i - 1); k > 0; k--) {
                sb.append(star);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

}
