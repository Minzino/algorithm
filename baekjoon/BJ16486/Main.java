package BJ16486;

import java.util.Scanner;

public class Main {

    private static final double PI = 3.141592;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        double result = (2 * d1) + (2 * PI * d2);

        System.out.println(result);

    }

}
