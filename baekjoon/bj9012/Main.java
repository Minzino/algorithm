package bj9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack;
        StringBuilder sb = new StringBuilder();

        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            stack = new Stack<>();
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(str.charAt(i));
                }
            }
            if (stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }

}
