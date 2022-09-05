package array;

import java.util.Scanner;

public class Problem0208 {

	public int[] solution(int students, int[] scores) {
		int[] answer = new int[students];
		for (int i = 0; i < students; i++) {
			int cnt = 1;
			for (int score : scores) {
				if (score > scores[i]) {
					cnt++;
				}
			}
			answer[i] = cnt;

		}
		return answer;
	}


	public static void main(String[] args) {
		Problem0208 T = new Problem0208();
		Scanner sc = new Scanner(System.in);

		int students = sc.nextInt();
		int[] scores = new int[students];

		for (int i = 0; i < students; i++) {
			scores[i] = sc.nextInt();
		}
		for (int x : T.solution(students, scores)) {
			System.out.print(x + " ");
		}
	}
}
