package bj1926.bfs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] board;
    static boolean[][] visited;
    static int n, m;
    static int area;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<Point> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 0 || visited[i][j]){
                   continue;
                }
                count++;
                bfs(i,j);
                if (max < area) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    public static void bfs(int startX, int startY) {
        queue = new LinkedList<>();
        queue.offer(new Point(startX, startY));
        visited[startX][startY] = true;
        area = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            area++;
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + point.x;
                int ny = dy[i] + point.y;
                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue;
                }
                if (board[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new Point(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
