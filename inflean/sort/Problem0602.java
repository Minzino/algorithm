package inflean.sort;

import java.util.Scanner;

public class Problem0602 {

	public int[] solution(int number, int[] arr) {
		for (int i = 0; i < number - 1; i++) {
			for (int j = 0; j < number - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0602 t = new Problem0602();

		int number = sc.nextInt();
		int[] arr = new int[number];

		for (int n : t.solution(number, arr)) {
			System.out.print(n + " ");
		}

	}

}
