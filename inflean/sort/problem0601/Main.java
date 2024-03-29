package sort.problem0601;

import java.util.Scanner;

public class Main {

	public int[] solution(int n, int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			int a = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[a]) {
					a = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[a];
			arr[a] = tmp;
		}

		return arr;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main t = new Main();

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : t.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

}
