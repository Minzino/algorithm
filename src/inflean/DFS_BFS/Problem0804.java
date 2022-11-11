package inflean.DFS_BFS;

import java.util.Scanner;

public class Problem0804 {

    static int[] pm;
    static int n, m;

    private void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }

        }
    }

    public static void main(String[] args) {
        Problem0804 t = new Problem0804();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        t.DFS(0);

    }
}
