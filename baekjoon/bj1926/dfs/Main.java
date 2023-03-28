package bj1926.dfs;

import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] board;
    static boolean[][] visit;
    static int area;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visit = new boolean[n][m];

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
                if (board[i][j] == 1 && !visit[i][j]) {
                    count++;
                    area = 0;
                    dfs(i, j);
                    if (area > max) {
                        max = area;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    static void dfs(int x, int y) {
        visit[x][y] = true;
        area++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                continue;
            }

            if (board[nx][ny] == 1 && !visit[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}

