package bj10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int size;
    static boolean[][] visited;
    static char[][] board;


    public static void bfs(int x, int y, char target) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < size && ny < size) {
                    if (board[nx][ny] == target && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());

        board = new char[size][size];

        for (int i = 0; i < size; i++) {
            board[i] = br.readLine().toCharArray();
        }

        visited = new boolean[size][size];
        int area = 0;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (!visited[x][y]) {
                    bfs(x, y, board[x][y]);
                    area++;
                }
                if (board[x][y] == 'G') {
                    board[x][y] = 'R';
                }
            }
        }

        visited = new boolean[size][size];
        int cArea = 0;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (!visited[x][y]) {
                    bfs(x, y, board[x][y]);
                    cArea++;
                }
            }
        }
        System.out.print(area + " " + cArea);
    }

}
