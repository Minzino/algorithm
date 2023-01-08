package bj1182;

import java.util.Scanner;

class Main {
    static int[] num;
    private static int n; // 정수의 개수
    private static int s; // 정수의 합
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        dfs(0, 0);
        if (s == 0) System.out.println(answer - 1); // S 0일때 처리
        else  System.out.println(answer);

    }

    private static void dfs(int depth, int sum) {
        if (depth == n) {
            if (sum == s) answer++;
            return;
        }
        dfs(depth + 1, sum + num[depth]); // 1. 해당 인덱스 더함
        dfs(depth + 1, sum); // 2. 해당 인덱스 더하지않음
    }
}
