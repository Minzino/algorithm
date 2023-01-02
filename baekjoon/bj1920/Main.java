package bj1920;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {

            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key) {

        int lf = 0;
        int rt = arr.length - 1;

        while (lf <= rt) {

            int mid = (lf + rt) / 2;

            if (key < arr[mid]) {
                rt = mid - 1;
            } else if (key > arr[mid]) {
                lf = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }
}