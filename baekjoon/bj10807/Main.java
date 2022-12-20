package bj10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        int[] numArr = new int[201];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < testCase; i++) {
            numArr[100 + Integer.parseInt(st.nextToken())]++;
        }

        int targetNum = Integer.parseInt(br.readLine());

        System.out.println(numArr[100 + targetNum]);

    }

}
