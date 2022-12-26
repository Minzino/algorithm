package bj10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char pipe = str.charAt(i);
            if (pipe == ')' && stack.peek() == i - 1) {
                stack.pop();
                sum += stack.size();
            } else if (pipe == '(') {
                stack.add(i);
            } else if (pipe == ')') {
                stack.pop();
                sum++;
            }

        }
        System.out.println(sum);
    }

}
