package bj2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n1 = 0, n2 = 1, n3 = 1;

        for (int i = 2; i <= n; i++) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
        System.out.println(n3);
    }

}
