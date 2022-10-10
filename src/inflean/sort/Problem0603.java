package inflean.sort;

import java.util.Scanner;

public class Problem0603 {

	public int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int tmp = arr[i], j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > tmp) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0603 t = new Problem0603();

		int number = sc.nextInt();
		int[] arr = new int[number];

		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		for (int n : t.solution(number, arr)) {
			System.out.print(n + " ");
		}
	}
}