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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] board = new int[row][col];
        boolean[][] visit = new boolean[row][col];
        Queue<Point> queue = new LinkedList<>();

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area;
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 0 || visit[i][j]) {
                    continue;
                }
                count++;
                queue.offer(new Point(i, j));
                visit[i][j] = true;
                area = 0;
                while (!queue.isEmpty()) {
                    Point point = queue.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int nx = point.x + dx[k];
                        int ny = point.y + dy[k];
                        if (nx < 0 || nx >= row || ny < 0 || ny >= col) {
                            continue;
                        }
                        if (board[nx][ny] == 1 && !visit[nx][ny]) {
                            queue.offer(new Point(nx, ny));
                            visit[nx][ny] = true;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }
            }

        }
        System.out.println(count);
        System.out.println(max);
    }

}
