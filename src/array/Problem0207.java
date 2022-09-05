package array;

import java.util.Scanner;

public class Problem0207 {

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
		Problem0207 T = new Problem0207();
		Scanner sc = new Scanner(System.in);

		int numbers = sc.nextInt();
		int[] scores = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(T.solution(numbers, scores));
	}
}
