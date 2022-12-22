package bj10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                answer -= stack.peek();
                stack.pop();
            } else {
                stack.push(number);
                answer += stack.peek();
            }
        }
        System.out.println(answer);
    }

}
