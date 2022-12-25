package bj1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String[] strArr = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            strArr[i] = br.readLine();
        }

        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            else {
                return s1.length() - s2.length();
            }
        };

        Arrays.sort(strArr,comparator);

        StringBuilder sb = new StringBuilder();

        sb.append(strArr[0]).append('\n');

        for (int i = 1; i < testCase; i++) {
            if (!strArr[i].equals(strArr[i - 1])) {
                sb.append(strArr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
