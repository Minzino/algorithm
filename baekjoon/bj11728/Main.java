package bj11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] a = new int[1000005];
    static int[] b = new int[1000005];
    static int[] c = new int[2000005];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int aidx = 0;
        int bidx = 0;

        for (int i = 0; i < n + m; i++) {
            if (bidx == m) {
                c[i] = a[aidx++];
            } else if (aidx == n) {
                c[i] = b[bidx++];
            } else if (a[aidx] <= b[bidx]) {
                c[i] = a[aidx++];
            } else {
                c[i] = b[bidx++];
            }

        }

        for (int i = 0; i < n + m; i++) {
            sb.append(c[i]).append(" ");
        }
        System.out.print(sb);
    }

}
