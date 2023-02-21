package bj1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrSize = Integer.parseInt(br.readLine());
        int[] arrA = new int[arrSize];
        Integer[] arrB = new Integer[arrSize];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrSize; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrA);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrSize; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrB, Comparator.reverseOrder());

        int sum = 0;

        for (int i = 0; i < arrSize; i++) {
            sum += (arrA[i] * arrB[i]);
        }

        System.out.println(sum);
    }
}
