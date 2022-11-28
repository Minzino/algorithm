package bj10993;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[][] arr;
    static boolean flag;

    static void setStar(int w, int h, int sRow, int sCol) {
        if (w < 1) {
            return;
        }

        // 밑변 그리기
        for (int i = sCol; i < sCol + w; i++) {
            arr[sRow][i] = '*';
        }

        // 양쪽 변 그리기
        int left = sCol, right = sCol + w - 1;
        if (flag) {
            for (int i = sRow; i >= sRow - h + 1; i--) {
                arr[i][left++] = '*';
                arr[i][right--] = '*';
            }
        } else {
            for (int i = sRow; i < sRow + h; i++) {
                arr[i][left++] = '*';
                arr[i][right--] = '*';
            }
        }
        flag = !flag; // 방향 반전
        int nextW = (w - 3) / 2;
        int nextH = nextW / 2 + 1;
        if (flag) {
            setStar(nextW, nextH, sRow + h / 2, sCol + h / 2 + 1);
        } else {
            setStar(nextW, nextH, sRow - h / 2, sCol + h / 2 + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int w = 1;
        for (int i = 1; i < n; i++) {
            w = w * 2 + 3;
        }
        int h = w / 2 + 1;
        arr = new char[h][w];

        if (n % 2 == 1) {
            flag = true;
        }
        if (flag) { // 정방향
            setStar(w, h, h - 1, 0);
        } else { // 역방향
            setStar(w, h, 0, 0);
        }

        int len;
        if (n % 2 == 1) {
            len = w / 2 + 1;
        } else {
            len = w;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i][j] == 0) {
                    sb.append(" ");
                } else {
                    sb.append(arr[i][j]);
                }
            }
            sb.append("\n");
            if (n % 2 == 1) {
                len++;
            } else {
                len--;
            }
        }
        System.out.print(sb);
    }
}

