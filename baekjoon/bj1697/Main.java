package bj1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int subin;
    static int bro;

    static int[] visited = new int[100001];

    static int bfs() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(subin);
        visited[subin] = 1;
        while (!queue.isEmpty()) {
            subin = queue.poll();

            if (subin == bro) {
                return visited[subin] - 1;
            }

            if (subin >= 1 && visited[subin - 1] == 0) {
                visited[subin - 1] = visited[subin] + 1;
                queue.offer(subin - 1);
            }
            if (subin < 100000 && visited[subin + 1] == 0) {
                visited[subin + 1] = visited[subin] + 1;
                queue.offer(subin + 1);
            }
            if (2 * subin <= 100000 && visited[2 * subin] == 0) {
                visited[2 * subin] = visited[subin] + 1;
                queue.offer(2 * subin);
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        subin = Integer.parseInt(st.nextToken());
        bro = Integer.parseInt(st.nextToken());

        System.out.println(bfs());
    }

}
