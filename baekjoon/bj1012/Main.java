package bj1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static Queue<Point> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    static int m, n, cabbage;
    static int[][] field;
    static boolean[][] visit;
    static int worms;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static void bfs() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            visit[point.x][point.y] = true;
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n && !visit[nx][ny]
                    && field[nx][ny] == 1) {
                    queue.offer(new Point(nx, ny));
                    visit[nx][ny] = true;
                }

            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            cabbage = Integer.parseInt(st.nextToken());
            field = new int[m][n];
            visit = new boolean[m][n];
            worms = 0;

            for (int i = 0; i < cabbage; i++) {
                st = new StringTokenizer(br.readLine());
                int p1 = Integer.parseInt(st.nextToken());
                int p2 = Integer.parseInt(st.nextToken());
                field[p1][p2] = 1;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (field[i][j] == 1 && !visit[i][j]) {
                        queue.offer(new Point(i, j));
                        bfs();
                        worms++;
                    }
                }
            }
            sb.append(worms).append("\n");
        }
        System.out.print(sb);

    }
}
