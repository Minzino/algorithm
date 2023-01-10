package bj2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int[] ropes = new int[number];
        for (int i = 0; i < number; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        long max = 0;
        for (int i = number - 1; i >= 0; i--) {
            ropes[i] = ropes[i] * (number - i);
            if(max < ropes[i]){
                max = ropes[i];
            }
        }
        System.out.println(max);
    }

}
