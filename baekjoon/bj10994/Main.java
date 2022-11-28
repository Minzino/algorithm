package bj10994;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[][] map;

    public static void drawStar(int testCase, int length) {
        for (int i = testCase; i < length; i++) {
            map[testCase][i] = '*';
            map[length - 1][i] = '*';
            if (i != testCase && i != length - 1) {
                map[i][testCase] = '*';
                map[i][length - 1] = '*';
            }
        }

        if (length == 1) {
            return;
        }
        drawStar(testCase + 2, length - 2);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        int mapSize = 4 * testCase - 3;
        map = new char[mapSize][mapSize];

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = ' ';
            }
        }

        drawStar(0, mapSize);

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
