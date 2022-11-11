package inflean.DFS_BFS;

import java.util.Scanner;

public class Problem0802 {

    static int answer = Integer.MIN_VALUE, c, n;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
        }
        DFS(L + 1, sum, arr);
    }

    public static void main(String[] args) {
        Problem0802 t = new Problem0802();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        t.DFS(0, 0, arr);
        System.out.println(answer);
    }

}
