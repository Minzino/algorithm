package bj1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int testCase = Integer.parseInt(br.readLine());

        int numberCnt = 1;

        while (testCase-- > 0) {

            int peekNum = Integer.parseInt(br.readLine());

            if (peekNum > numberCnt) {
                for (int i = numberCnt; i <= peekNum; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                numberCnt = peekNum;
            } else if (stack.peek() != peekNum) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb);
    }
}
