package bj15649;

import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        func(0);
    }

    static void func(int k) {
        if (k == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                func(k + 1);
                isUsed[i] = false;
            }
        }
    }

}
