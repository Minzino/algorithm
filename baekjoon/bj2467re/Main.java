package bj2467re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long min = Long.MAX_VALUE;
        int resultLeft = 0;
        int resultRight = 0;
        for (int i = 0; i < n - 1; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                long sum = Math.abs(arr[i] + arr[mid]);

                if (min > sum) {
                    min = sum;
                    resultLeft = i;
                    resultRight = mid;
                }
                if (arr[mid] >= -arr[i]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        System.out.println(arr[resultLeft] + " " + arr[resultRight]);
    }
}
