package array.Problem0205;

import java.util.Scanner;

public class Problem0205 {

	public int solution(int n) {
		int cnt = 0;
		int[] ch = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if (ch[i] == 0) {
				cnt++;
				for (int j = i; j <= n; j = j + i) {
					ch[j] = 1;
				}
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		Problem0205 T = new Problem0205();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(T.solution(n));
	}
}
