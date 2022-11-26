package stack_queue.problem0501;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public String solution(String a) {
		Stack<Character> st = new Stack<>();
		String answer = "YES";

		for (char x : a.toCharArray()) {
			if (x == '(') {
				st.push(x);
			}
			else{
				if(st.isEmpty()){
					return "NO";
				}
				st.pop();
			}
		}
		if(!st.isEmpty()){
			return "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main t = new Main();

		String a = sc.next();

		System.out.println(t.solution(a));
	}

}
