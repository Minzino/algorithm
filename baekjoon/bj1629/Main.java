package bj1629;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(pow(a, b, c));
    }

    public static long pow(int a, int b, int m) {
        if (b == 1) {
            return a % m;
        }
        long val = pow(a, b / 2, m);
        val = val * val % m;
        if (b % 2 == 0) {
            return val;
        }
        return val * a % m;
    }

}
