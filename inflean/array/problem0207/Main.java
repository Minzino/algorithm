package array.problem0207;

import java.util.Scanner;

public class Main {

	public int solution(int numbers, int[] scores) {
		int answer = 0;
		int cnt = 0;
		for (int i = 0; i < numbers; i++) {
			if (scores[i] == 1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);

		int numbers = sc.nextInt();
		int[] scores = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(T.solution(numbers, scores));
	}
}
