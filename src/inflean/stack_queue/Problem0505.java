package inflean.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Problem0505 {

	public int solution(String a) {
		Stack<Character> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '(') {
				stack.push('(');
			} else {
				stack.pop();
				if (a.charAt(i - 1) == '(') {
					answer += stack.size();
				} else {
					answer++;
				}
			}
		}
		return answer;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0505 t = new Problem0505();

		String a = sc.next();

		System.out.println(t.solution(a));

	}

}
