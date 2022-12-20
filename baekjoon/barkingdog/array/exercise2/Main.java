package barkingdog.array.exercise2;

import java.util.Arrays;

public class Main {

    public int func(int[] arr, int length) {
        int[] answer = new int[101];
        for (int i = 0; i < length; i++) {
            if(answer[100-arr[i]] == 1){
                return 1;
            }
            answer[arr[i]] = 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main t = new Main();
        System.out.println(t.func(new int[]{1, 52, 48}, 3));
    }

}
