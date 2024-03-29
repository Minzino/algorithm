package bj1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static int red = 0;
    final static int green = 1;
    final static int blue = 2;

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int house = Integer.parseInt(br.readLine());
        cost = new int[house][3];
        dp = new int[house][3];

        StringTokenizer st;
        for (int i = 0; i < house; i++) {

            st = new StringTokenizer(br.readLine());

            cost[i][red] = Integer.parseInt(st.nextToken());
            cost[i][green] = Integer.parseInt(st.nextToken());
            cost[i][blue] = Integer.parseInt(st.nextToken());
        }

        // DP의 첫번째 값(집)은 각 색상비용의 첫번째 값으로 초기화
        dp[0][red] = cost[0][red];
        dp[0][green] = cost[0][green];
        dp[0][blue] = cost[0][blue];

        System.out.println(Math.min(Paint_cost(house - 1, red),
            Math.min(Paint_cost(house - 1, green), Paint_cost(house - 1,
                blue))));
    }

    static int Paint_cost(int house, int color) {

        // 만약 탐색하지 않은 배열이라면
        if (dp[house][color] == 0) {

            // color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다
            if (color == red) {
                dp[house][red] =
                    Math.min(Paint_cost(house - 1, green), Paint_cost(house - 1, blue)) + cost[house][red];
            } else if (color == green) {
                dp[house][green] =
                    Math.min(Paint_cost(house - 1, red), Paint_cost(house - 1, blue)) + cost[house][green];
            } else {
                dp[house][blue] =
                    Math.min(Paint_cost(house - 1, red), Paint_cost(house - 1, green)) + cost[house][blue];
            }

        }

        return dp[house][color];
    }
}
