package bj3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] numberCount = new boolean[2000001];
        int answer = 0;

        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            if (x - arr[i] > 0 && numberCount[x - arr[i]]) {
                answer++;
            }
            numberCount[arr[i]] = true;
        }
        System.out.println(answer);
    }

}
