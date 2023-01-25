package bj2623;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int n, m;
    static int[] indeg;
    static ArrayList<Integer>[] graph;
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        indeg = new int[n + 1];

        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            for (int j = 1; j < cnt; j++) {
                int y = Integer.parseInt(st.nextToken());
                graph[x].add(y);
                indeg[y]++;
                x = y;
            }
        }

        solution();
    }

    static void solution() {
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (indeg[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int x = queue.poll();
            answer.add(x);
            for (int y : graph[x]) {
                indeg[y]--;
                if (indeg[y] == 0) {
                    queue.add(y);
                }
            }
        }
        if (answer.size() != n) {
            System.out.println(0);
        } else {
            for (int x : answer) {
                sb.append(x).append("\n");
            }
            System.out.print(sb);
        }
    }
}
