package bj11050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int divisor = 1;
        int dividend = 1;
        int result;

        for (int i = 0; i < k; i++) {
            dividend *= n - i;
            divisor *= k - i;
        }

        result = dividend / divisor;
        System.out.println(result);
    }

}
