package bj11729;

import java.util.Scanner;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int block = sc.nextInt();
        sb.append((int) (Math.pow(2, block) - 1)).append("\n");

        hanoi(1, 3, block);

        System.out.print(sb);
    }

    public static void hanoi(int a, int b, int n) {
        if (n == 1) {
            sb.append(a).append(" ").append(b).append("\n");
            return;
        }
        hanoi(a, 6 - a - b, n - 1);
        sb.append(a).append(" ").append(b).append("\n");
        hanoi(6 - a - b, b, n - 1);
    }

}
