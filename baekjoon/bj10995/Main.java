package bj10995;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("* ".repeat(n)).append("\n");
            } else {
                sb.append(" *".repeat(n)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
