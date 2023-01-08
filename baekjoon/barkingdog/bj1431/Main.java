package barkingdog.bj1431;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String[] arr = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = br.readLine();
        }//입력

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() == o2.length()) {
                if (add(o1) == add(o2)) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(add(o1), add(o2));
                }
            } else {
                return 1;
            }

        });
        for (String i : arr) {
            System.out.println(i);
        }


    }

    public static int add(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        return sum;
    }

}
