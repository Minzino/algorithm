package bj14503;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[][] roomMap;
    public static int cleanedCount = 0;
    public static int[] dr = {-1, 0, 1, 0}; // 북,동,남,서
    public static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        roomMap = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                roomMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cleanRoom(row, col, direction);

        bw.write(cleanedCount + "\n");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void cleanRoom(int row, int col, int direction) {
        // 1. 현재 위치를 청소한다.
        if (roomMap[row][col] == 0) {
            roomMap[row][col] = 2;
            cleanedCount++;
        }

        // 2. 왼쪽 방향부터 차례대로 탐색을 진행한다.
        boolean flag = false;
        int originalDirection = direction;
        for (int i = 0; i < 4; i++) {
            int nextDirection = (direction + 3) % 4;
            int nextRow = row + dr[nextDirection];
            int nextCol = col + dc[nextDirection];

            if (nextRow > 0 && nextCol > 0 && nextRow < N && nextCol < M) {
                if (roomMap[nextRow][nextCol] == 0) {   // 아직 청소하지 않은 공간이라면
                    cleanRoom(nextRow, nextCol, nextDirection);
                    flag = true;
                    break;
                }
            }
            direction = (direction + 3) % 4;
        }

        // 네 방향 모두 청소가 되어있거나 벽인 경우
        if (!flag) {
            int nextDirection = (originalDirection + 2) % 4;
            int nextBackRow = row + dr[nextDirection];
            int nextBackCol = col + dc[nextDirection];

            if (nextBackRow > 0 && nextBackCol > 0 && nextBackRow < N && nextBackCol < M) {
                if (roomMap[nextBackRow][nextBackCol] != 1) {
                    cleanRoom(nextBackRow, nextBackCol, originalDirection); // 바라보는 방향 유지한 채 후진
                }
            }
        }
    }
}
