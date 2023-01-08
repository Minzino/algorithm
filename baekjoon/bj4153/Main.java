package bj4153;

import static java.lang.Math.sqrt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a + b + c == 0) {
                break;
            }
            if (a < c && b < c) {
                a *= a;
                b *= b;
                if (sqrt(a + b) == c) {
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            } else if (a < b && c < b) {
                a *= a;
                c *= c;
                if (sqrt(a + c) == b) {
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            } else if (b < a && c < a) {
                b *= b;
                c *= c;
                if (sqrt(b + c) == a) {
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            }
        }
        System.out.print(sb);
    }

}
