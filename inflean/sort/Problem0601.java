package inflean.sort;

import java.util.Scanner;

public class Problem0601 {

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
		Problem0601 t = new Problem0601();

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
