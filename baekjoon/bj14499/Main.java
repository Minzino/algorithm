package bj14499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Dice curDice = new Dice(0, 1, 2, 3, 4, 5);
        int[] dice = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int command = Integer.parseInt(st.nextToken());

            int top = curDice.top;
            int up = curDice.up;
            int down = curDice.down;
            int left = curDice.left;
            int right = curDice.right;
            int bottom = curDice.bottom;

            Dice nextDice;

            if (command == 1) {
                command = 3;
                nextDice = new Dice(left, up, down, bottom, top, right);
            } else if (command == 2) {
                command = 1;
                nextDice = new Dice(right, up, down, top, bottom, left);
            } else if (command == 3) {
                command = 0;
                nextDice = new Dice(up, bottom, top, left, right, down);
            } else {
                command = 2;
                nextDice = new Dice(down, top, bottom, left, right, up);
            }

            int nx = x + dx[command];
            int ny = y + dy[command];

            if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                continue;
            }

            curDice = nextDice;
            x = nx;
            y = ny;

            if (map[nx][ny] == 0) {
                map[nx][ny] = dice[nextDice.bottom];
                System.out.println(dice[nextDice.top]);
            }else{
                dice[nextDice.bottom] = map[nx][ny];
                map[nx][ny] = 0;
                System.out.println(dice[nextDice.top]);
            }
        }
    }
}

class Dice {

    int top, up, down, left, right, bottom;

    public Dice(int top, int up, int down, int left, int right, int bottom) {
        this.top = top;
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.bottom = bottom;
    }
}
