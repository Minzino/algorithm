package barkingdog.sort.basic;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, -1};
        int n = 5;
        int tmp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
