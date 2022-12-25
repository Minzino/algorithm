package bj2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int range = 2;
        int depth = 1;

        while (number >= range) {
            range += 6 * depth++;
        }
        System.out.println(depth);
    }

}
