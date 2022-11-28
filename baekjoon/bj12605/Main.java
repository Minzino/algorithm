package bj12605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = strArr.length - 1; j >= 0; j--) {
                System.out.print(strArr[j] + " ");
            }
            System.out.println();
        }
    }
}

