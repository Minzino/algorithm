package bj2206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] board;
    static boolean[][][] visited;
    static int n, m;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m][2];

        for (int i = 0; i < n; i++) {
            String inputs = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = inputs.charAt(j) - '0';
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0, 0, 1));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point.x == n-1 && point.y == m-1) {
                return point.dist;
            }
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + point.x;
                int ny = dy[i] + point.y;

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (board[nx][ny] == 0 && !visited[nx][ny][point.broke]) {
                        visited[nx][ny][point.broke] = true;
                        queue.offer(new Point(nx, ny, point.broke, point.dist + 1));
                    }
                    else if (board[nx][ny] == 1 && point.broke == 0) {
                        visited[nx][ny][1] = true;
                        queue.offer(new Point(nx, ny, 1, point.dist + 1));
                    }
                }
            }
        }
        return -1;
    }
}

class Point {
    int x, y, broke, dist;

    public Point(int x, int y, int broke, int dist) {
        this.x = x;
        this.y = y;
        this.broke = broke;
        this.dist = dist;
    }
}
