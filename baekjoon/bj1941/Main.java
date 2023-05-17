package bj1941;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static char[][] classroom;
    static boolean[] visited;
    static int[] checked = new int[7];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        classroom = new char[5][5];
        for (int i = 0; i < 5; i++) {
            classroom[i] = br.readLine().toCharArray();
        }

        comb(0, 0, 0);
        System.out.println(ans);
    }

    static void comb(int cnt, int start, int dasomCnt) {
        if (cnt - dasomCnt > 3) {
            return;
        }

        if (cnt == 7) {
            visited = new boolean[7];
            bfs(checked[0] / 5, checked[0] % 5);
            return;
        }

        for (int i = start; i < 25; i++) {
            int row = i / 5, col = i % 5;
            checked[cnt] = i;
            comb(cnt + 1, i + 1, (classroom[row][col] == 'S') ? dasomCnt + 1 : dasomCnt);
        }

    }

    static void bfs(int i, int j) {
        int num = 1;
        visited[0] = true;
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(i, j));
        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = currentPoint.x + dx[dir], ny = currentPoint.y + dy[dir];
                if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
                    continue;
                }
                int next = 5 * nx + ny;
                for (int k = 0; k < 7; k++) {
                    if (!visited[k] && checked[k] == next) {
                        visited[k] = true;
                        num++;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }
        if (num == 7) {
            ans++;
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
