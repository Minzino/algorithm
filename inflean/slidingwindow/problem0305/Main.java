package slidingwindow.problem0305;

import java.util.Scanner;

public class Main {

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
		Main T = new Main();

		int number = sc.nextInt();

		System.out.println(T.solution(number));
	}

}
