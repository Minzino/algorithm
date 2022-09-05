package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0206 {

	public ArrayList<Integer> solution(int n, int[] intArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = intArr[i];
			int res = 0;
			while (tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp = tmp / 10;
			}
			if (isPrime(res)) {
				answer.add(res);
			}
		}
		return answer;
	}

	private boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Problem0206 T = new Problem0206();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] intArr = new int[n];

		for (int i = 0; i < n; i++) {
			intArr[i] = sc.nextInt();
		}

		for (int x : T.solution(n, intArr)) {
			System.out.print(x + " ");
		}
	}
}
