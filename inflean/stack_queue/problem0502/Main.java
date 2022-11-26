package stack_queue.problem0502;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public String solution(String a) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (char x : a.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else {
				if (stack.isEmpty()) {
					sb.append(x);
				}if(x == ')'){
					stack.pop();
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main t = new Main();

		String a = sc.next();
		System.out.println(t.solution(a));
	}
}
