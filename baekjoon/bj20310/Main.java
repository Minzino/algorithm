package bj20310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[2];

        String numStr = br.readLine();

        for (int i = 0; i < numStr.length(); i++) {
            arr[numStr.charAt(i) - '0']++;
        }

        arr[0] /= 2;
        arr[1] /= 2;

        int appendedZeros = 0;
        int deletedOnes = 0;
        for (char c : numStr.toCharArray()) {
            if(c == '1'){
                if(deletedOnes < arr[1]){
                    deletedOnes++;
                }
                else{
                    sb.append(1);
                }
            }else{
                if (appendedZeros < arr[0]) {
                    sb.append(0);
                    appendedZeros++;
                }
            }
        }
        System.out.println(sb);
    }
}
