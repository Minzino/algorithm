package bj11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    sb.append(queue.poll()).append(", ");
                    continue;
                }
                queue.offer(queue.poll());
            }
        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb);

    }

}
