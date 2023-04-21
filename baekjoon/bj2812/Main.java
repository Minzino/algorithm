package bj2812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String number = br.readLine();

        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for (int i = 0; i < N; i++) {
            int current = number.charAt(i) - '0';
            while (count < K && !stack.isEmpty() && stack.peek() < current) {
                stack.pop();
                count++;
            }
            stack.push(current);
        }

        // K개를 제거하지 못한 경우를 처리합니다.
        while (count < K) {
            stack.pop();
            count++;
        }

        for (int i = 0; i < N - K; i++) {
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse());
    }

}
