package bj15683;

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
    static int[] dy = {0, -1, 0, -1};

    static int[][] arr;
    static int[][] arrClone;
    static Queue<Point> cctv = new LinkedList<>();

    public static void bfs() {
        Point point = cctv.poll();
        while (cctv.size() > 0) {
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        arr = new int[row][col];
        arrClone = new int[row][col];
        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] <= 1 && arr[i][j] >= 5) {
                    cctv.offer(new Point(i, j));
                }
            }
        }
        arrClone = arr.clone();
        bfs();

    }
}
