package bj18883;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int cnt = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == col - 1) {
                    sb.append(cnt);
                    cnt++;
                } else {
                    sb.append(cnt).append(" ");
                    cnt++;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
