package bj1644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static boolean[] primeNumcheck;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        primeNumcheck = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        primeNumcheck[0] = primeNumcheck[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!primeNumcheck[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primeNumcheck[j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!primeNumcheck[i]) {
                primes.add(i);
            }
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            if (sum >= n) {
                sum -= primes.get(start++);
            } else if (end == primes.size()) {
                break;
            } else {
                sum += primes.get(end++);
            }
            if (n == sum) {
                count++;
            }
        }

        System.out.println(count);
    }

}
