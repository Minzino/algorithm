package bj1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for(int i = 0; i < n; i++) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if(num == 1) {	// 1 인경우 다음 반복문으로
                continue;
            }

            for(int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    isPrime = false;	// 소수가 아니므로 false 로 바꿔줌
                    break;
                }
            }

            if(isPrime) {	// 소수인경우 count 값 1 증가
                count++;
            }
        }
        System.out.println(count);
    }

}
