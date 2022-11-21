package BJ11023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ11023 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        final int sum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();

        System.out.print(sum);
    }

}
