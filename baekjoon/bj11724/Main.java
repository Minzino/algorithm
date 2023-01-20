package bj11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] check; // 간선 연결 상태
    static boolean[] checked; // 확인 여부
    static int n; // 정점 개수
    static int m; // 간선 개수

    // 시작점을 변수로 받아 출발, 출력 후 다음 연결점을 찾아 시작점을 변경하여 재호출
    public static void dfs(int i) {
        checked[i] = true;
        for (int j = 1; j <= n; j++) {
            if (check[i][j] == 1 && !checked[j]) {
                dfs(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점 개수
        m = Integer.parseInt(st.nextToken()); // 간선 개수

        check = new int[1001][1001]; // 좌표를 그대로 받아들이기 위해 +1해서 선언
        checked = new boolean[1001]; // 초기값 False

        // 간선 연결상태 저장
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            check[u][v] = check[v][u] = 1;
        }

        int count = 0; // 결과값

        for (int k = 1; k <= n; k++) {    // 0이라는 점이 없으므로 k는 1에서 출발, k는 n보다 작거나 같아야 함!
            if (!checked[k]) {
                dfs(k);
                count++;
            }
        }

        System.out.print(count);
    }
}
