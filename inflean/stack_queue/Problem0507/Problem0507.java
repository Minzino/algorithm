package stack_queue.Problem0507;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem0507 {

	public String solution(String a, String b) {
		Queue<Character> queue = new LinkedList<>();
		String answer = "YES";

		for (char x : a.toCharArray()) {
			queue.offer(x);
		}

		for (char x : b.toCharArray()) {
			if (queue.contains(x) && x != queue.poll()) {
				answer = "NO";
			}
		}

		if (!queue.isEmpty()) {
			return "NO";
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0507 t = new Problem0507();

		String a = sc.next();
		String b = sc.next();

		System.out.println(t.solution(a, b));

	}

}
