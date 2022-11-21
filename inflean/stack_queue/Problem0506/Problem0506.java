package stack_queue.Problem0506;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem0506 {

	public int solution(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			queue.offer(i + 1);
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < k - 1; j++) {
				queue.offer(queue.poll());
			}
			queue.poll();
		}

		return queue.peek();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0506 t = new Problem0506();

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(t.solution(n, k));

	}

}
