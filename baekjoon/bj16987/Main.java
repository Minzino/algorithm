package bj16987;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    static int N, result;
    static int[][] eggs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        eggs = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            eggs[i][0] = Integer.parseInt(input[0]); // durability
            eggs[i][1] = Integer.parseInt(input[1]); // weight
        }

        dfs(0);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.newLine();
        bw.flush();
        bw.close();
    }

    static void dfs(int idx) {
        if (idx == N) {
            result = Math.max(result, getBrokenCount());
            return;
        }

        if (eggs[idx][0] <= 0) {
            dfs(idx + 1);
        } else {
            boolean isBroken = false;

            for (int i = 0; i < N; i++) {
                if (i == idx || eggs[i][0] <= 0) {
                    continue;
                }

                isBroken = true;
                eggs[idx][0] -= eggs[i][1];
                eggs[i][0] -= eggs[idx][1];

                dfs(idx + 1);

                eggs[idx][0] += eggs[i][1];
                eggs[i][0] += eggs[idx][1];
            }

            if (!isBroken) {
                dfs(idx + 1);
            }
        }
    }

    static int getBrokenCount() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (eggs[i][0] <= 0) {
                count++;
            }
        }
        return count;
    }
}
