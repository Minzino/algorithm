package bj12865;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, k, w, v; // N : 물품 수, K : 버틸 수 있는 무게, W : 물건의 무게, V : 물건의 가

    private static class Pair implements Comparable<Pair> {

        int w; // 무게
        int v; // 가치

        public Pair(int w, int v) {
            this.w = w;
            this.v = v;
        }

        @Override
        public int compareTo(Pair o) {
            return this.w - o.w;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 물품 수
        k = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게
        Pair[] stuff = new Pair[n + 1]; // 물건의 무게와 가치 저장
        stuff[0] = new Pair(0, 0);
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); // 물건의 무게
            v = Integer.parseInt(st.nextToken()); // 물건의 가치
            stuff[i] = new Pair(w, v);
        }
        Arrays.sort(stuff);
        // DP
        int knapsack[][] = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (stuff[i].w > j) { // i번째 물건의 무게가 j보다 클 때
                    knapsack[i][j] = knapsack[i - 1][j];
                    System.out.print(knapsack[i][j]);
                } else { // i번째 물건의 무게가 j보다 작을 때
                    knapsack[i][j] = Math.max(stuff[i].v + knapsack[i - 1][j - stuff[i].w],
                        knapsack[i - 1][j]);
                    System.out.print(knapsack[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println(knapsack[n][k]);
    }

}
