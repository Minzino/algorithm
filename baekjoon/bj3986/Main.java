package bj3986;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Character> stack;
        Scanner sc = new Scanner(System.in);
        String str;
        int answer = 0;

        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            stack = new Stack<>();
            str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if (!stack.isEmpty() && stack.peek() == str.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(str.charAt(i));
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        System.out.print(answer);
    }

}
