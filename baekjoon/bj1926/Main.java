package bj1926;

import java.util.*;
import java.io.*;

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {


    static int row, col;
    static int[][] board;
    static boolean[][] visit;
    static Queue<Point> queue;
    static int area;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        board = new int[row][col];
        visit = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 0 || visit[i][j]) {
                    continue;
                }
                count++;
                bfs(i, j);
                if (area > max) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    static void bfs(int startX, int startY) {
        queue = new LinkedList<>();
        queue.offer(new Point(startX, startY));
        visit[startX][startY] = true;
        area = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            area++;
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx < 0 || nx >= row || ny < 0 || ny >= col) {
                    continue;
                }
                if (board[nx][ny] == 1 && !visit[nx][ny]) {
                    queue.offer(new Point(nx, ny));
                    visit[nx][ny] = true;
                }
            }
        }
    }

}
