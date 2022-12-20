package bj1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int[] numberArr = new int[10];
        int ans = 1;

        while (number > 0) {
            numberArr[number % 10]++;
            number /= 10;
        }

        for (int i = 0; i < numberArr.length; i++) {
            if (i == 6 || i == 9) {
                continue;
            }
            ans = Math.max(ans, numberArr[i]);
        }

        ans = Math.max(ans, (numberArr[6] + numberArr[9] + 1) / 2);
        System.out.println(ans);
    }
}
