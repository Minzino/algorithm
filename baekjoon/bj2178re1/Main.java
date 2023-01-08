package bj2178re1;

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

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int row;
    static int col;
    static int[][] board;
    static int[][] dis;


    public int bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        board[x][y] = 0;
        dis[x][y] = 1;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && nx < row && ny >= 0 && ny < col && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[point.x][point.y] + 1;
                }
            }
        }
        if (dis[row - 1][col - 1] == 0) {
            return -1;
        } else {
            return dis[row - 1][col - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main t = new Main();

        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        board = new int[row][col];
        dis = new int[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            String borad_row = st.nextToken();
            for (int j = 0; j < col; j++) {
                board[i][j] = borad_row.charAt(j) - '0';
            }
        }

        System.out.println(t.bfs(0, 0));
    }

}
