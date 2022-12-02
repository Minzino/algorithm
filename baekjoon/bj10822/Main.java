package bj10822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String[] strArr = br.readLine().split(",");

        for(String number: strArr){
            answer += Integer.parseInt(number);
        }
        System.out.println(answer);
    }

}
