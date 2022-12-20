package bj2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());

        int multi = first * second * third;
        int[] answer = new int[10];

        while (multi > 0) {
            answer[multi % 10]++;
            multi /=10;
        }

        for (int i = 0; i < 10; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }

}
