package bj2230;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int rt = 0, lt = 0;
        int ans = Integer.MAX_VALUE;
        // 투 포인터 알고리즘
        while (rt < n) {
            if (arr[rt] - arr[lt] < m) {
                rt++;
                continue;
            }

            if (arr[rt] - arr[lt] == m) {
                ans = m;
                break;
            }

            ans = Math.min(ans, arr[rt] - arr[lt]);
            lt++;
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
