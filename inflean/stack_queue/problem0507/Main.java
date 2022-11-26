package stack_queue.problem0507;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

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
		Main t = new Main();

		String a = sc.next();
		String b = sc.next();

		System.out.println(t.solution(a, b));

	}

}
