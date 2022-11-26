package dfs_bfs.problem0809;

import java.util.*;

public class Main {

    static int[] combi;
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        t.DFS(0, 1);
    }
}
