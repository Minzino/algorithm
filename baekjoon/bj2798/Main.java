package bj2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, n, m);
        System.out.println(result);
    }


    static int search(int[] arr, int N, int M) {
        int result = 0;

        for (int i = 0; i < N - 2; i++) {
            if (arr[i] > M) {
                continue;
            }
            for (int j = i + 1; j < N - 1; j++) {
                if (arr[i] + arr[j] > M) {
                    continue;
                }
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (M == sum) {
                        return sum;
                    }
                    if (result < sum && sum < M) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
