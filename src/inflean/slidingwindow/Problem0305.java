package inflean.slidingwindow;

import java.util.Scanner;

public class Problem0305 {

	public int solution(int number) {
		int answer = 0;
		for (int i = 1; i < number / 2 + 1; i++) {
			int sum = 0;
			int p1 = i;
			while (sum <= number) {
				if (sum == number) {
					answer++;
					break;
				}
				sum += p1++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0305 T = new Problem0305();

		int number = sc.nextInt();

		System.out.println(T.solution(number));
	}

}
