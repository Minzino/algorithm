package inflean.DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem0805 {

    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        }
        if (L >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }

    }

    public static void main(String[] args) {
        Problem0805 t = new Problem0805();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();

        t.DFS(0, 0, arr);
        System.out.println(answer);
    }

}
