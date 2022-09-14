package inflean.slidingwindow;

import java.util.Scanner;

public class Problem0304 {

	public int solution(int N, int M, int[] sequenceArr) {
		int sum = 0;
		int answer = 0;

		for (int i = 0; i < N; i++) {
			int p1 = i;
			while (sum != M) {
				if (sum < M) {
					sum += sequenceArr[p1++];
				}
				if (sum > M) {
					sum = 0;
					break;
				}

				if (sum == M) {
					sum = 0;
					answer++;
					break;
				} else if (p1 == N) {
					sum = 0;
					break;
				}

			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0304 T = new Problem0304();

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] sequenceArr = new int[N];

		for (int i = 0; i < N; i++) {
			sequenceArr[i] = sc.nextInt();
		}

		System.out.println(T.solution(N, M, sequenceArr));
	}

}

