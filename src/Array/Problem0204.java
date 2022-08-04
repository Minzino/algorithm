package Array;

import java.util.Scanner;

public class Problem0204 {

	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 1] + answer[i - 2];
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem0204 T = new Problem0204();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int x : T.solution(n)) {
			System.out.print(x + " ");
		}
	}
}
