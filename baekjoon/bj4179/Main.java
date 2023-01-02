package bj4179;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Point {

    int x;
    int y;
    int type;
    int count;

    public Point(int x, int y, int type, int count) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.count = count;
    }
}

public class Main {

    static int row;
    static int col;
    static char[][] board;
    static boolean[][] visited;
    static Point human;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        board = new char[row][col];
        visited = new boolean[row][col];
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < col; j++) {
                board[i][j] = input[j].charAt(0);

                if (board[i][j] == 'J') {
                    // 시작점에서 바로 탈출 가능한 경우
                    if (isEdge(i, j)) {
                        System.out.println(1);
                        return;
                    }

                    board[i][j] = '.';
                    human = new Point(i, j, 0, 0);
                } else if (board[i][j] == 'F') {
                    queue.add(new Point(i, j, 1, 0));
                }
            }
        }

        bfs(queue);
    }

    static void bfs(Queue<Point> queue) {
        int x;
        int y;
        int count;

        queue.add(human); // 불 - 지훈의 순서로 queue에 넣어줌
        visited[human.x][human.y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            x = point.x;
            y = point.y;
            count = point.count;

            // 종료 조건
            if (isEdge(x, y) && point.type == 0) {
                System.out.println(count + 1);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isRange(nx, ny) || board[nx][ny] == '#' || board[nx][ny] == 'F') {
                    continue;
                }

                if (point.type == 0 && !visited[nx][ny]) {
                    // 지훈
                    queue.add(new Point(nx, ny, point.type, count + 1));
                    visited[nx][ny] = true;
                } else if (point.type == 1) {
                    // 불
                    board[nx][ny] = 'F';
                    queue.add(new Point(nx, ny, point.type, count + 1));
                }
            }
        }

        System.out.println("IMPOSSIBLE");
    }

    /*
     * MAZE의 범위를 벗어나는지 판별
     * @return : 입력받은 좌쵸가 범위 내에 있으면 true
     * */
    static boolean isRange(int x, int y) {
        return x < 0 || y < 0 || x >= row || y >= col;
    }

    /*
     * MAZE의 가장자리인지 판별
     * @return: 가장자리이면 true
     * */
    static boolean isEdge(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (isRange(nx, ny)) {
                return true;
            }
        }

        return false;
    }

}
