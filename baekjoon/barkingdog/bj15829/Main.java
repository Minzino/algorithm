package barkingdog.bj15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strLength = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int r = 31;
        int m = 1234567891;

        long cal = 0;
        long pow = 1;

        for (int i = 0; i < strLength; i++) {
            cal += ((str.charAt(i) - 96) * pow);
            pow = (pow * r) % m;
        }
        cal %= m;

        System.out.println(cal);

    }

}
