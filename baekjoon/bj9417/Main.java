package bj9417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int max = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            for (int i = 0; i < arr.size(); i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    max = Math.max(max, gcd(arr.get(i), arr.get(j)));
                }
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }

}
