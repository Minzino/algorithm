package bj10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append(" ");
            }
            else{
                sb.append(0).append(" ");

            }
        }
        System.out.print(sb);
    }

    public static int binarySearch(int key) {
        int lt = 0;
        int rt = arr.length;

        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (key < arr[mid]) {
                rt = mid;
            } else if (key > arr[mid]) {
                lt = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
