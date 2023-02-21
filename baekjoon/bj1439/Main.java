package bj1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer countOne = new StringTokenizer(str, "0");
        StringTokenizer countZero = new StringTokenizer(str, "1");

        System.out.println(Math.min(countOne.countTokens(), countZero.countTokens()));
    }
}
