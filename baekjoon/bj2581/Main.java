package bj2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        prime = new boolean[n + 1];    // 배열 생성
        get_prime();

        // 소수 합 및 최솟값
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {
            if (!prime[i]) {    // false = 소수
                sum += i;
                if (min == Integer.MAX_VALUE) {    // 첫 소수가 최솟값임
                    min = i;
                }
            }
        }

        if (sum == 0) {    // 소수가 없다면
            sb.append(-1);
        } else {
            sb.append(sum).append("\n").append(min);
        }
        System.out.println(sb);

    }

    // 에라토스테네스 체 알고리즘
    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
