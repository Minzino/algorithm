package bj8595;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder tmp = new StringBuilder();
        long sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                tmp.append(c);
            } else {
                if (tmp.length() > 0) {
                    sum += Long.parseLong(tmp.toString());
                    tmp = new StringBuilder();
                }
            }
        }
        if (tmp.length() > 0) {
            sum += Long.parseLong(tmp.toString());
            tmp = new StringBuilder();
        }
        System.out.println(sum);

    }

}
