package bj10250;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int floor = Integer.parseInt(st.nextToken());
            st.nextToken();
            int customer = Integer.parseInt(st.nextToken());

            if (customer % floor == 0) {
                sb.append((floor * 100) + (customer / floor)).append('\n');

            } else {
                sb.append(((customer % floor) * 100) + ((customer / floor) + 1)).append('\n');
            }
        }
        System.out.print(sb);

    }
}
