package array.problem0203;

import java.util.Scanner;

public class Main {

	public String solution(int n, int[] a, int[] b) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) {
				answer.append("D");
			} else if (a[i] == 1 && b[i] == 3) {
				answer.append("A");
			} else if (a[i] == 2 && b[i] == 1) {
				answer.append("A");
			} else if (a[i] == 3 && b[i] == 2) {
				answer.append("A");
			} else {
				answer.append("B");
			}
		}
		return answer.toString();
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (char x : T.solution(n, a, b).toCharArray()) {
			System.out.println(x);
		}
	}
}
