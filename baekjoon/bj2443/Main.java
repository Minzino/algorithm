package bj2443;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        char star = '*';

        for (int i = 1; i <= testCase; i++) {
            for (int k = i - 1; k > 0; k--) {
                sb.append(" ");
            }
            for (int j = 2 * testCase - (2 * i - 1); j > 0; j--) {
                sb.append(star);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

}
