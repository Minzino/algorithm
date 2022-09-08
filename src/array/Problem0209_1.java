package array;

import java.util.Scanner;

public class Problem0209_1 {

	public int solution(int number, int[][] map) {
		int[] sums = new int[number * 2 + 2];
		int result = 0;

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				sums[i] += map[i][j];
				sums[number + i] += map[j][i];
			}
		}
		for (int i = 0; i < number; i++) {
			sums[number * 2] += map[i][i];
			sums[number * 2 + 1] += map[i][number - 1 - i];
		}
		for (int sum : sums) {
			result = Math.max(sum, result);
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0209_1 T = new Problem0209_1();

		int number = sc.nextInt();
		int[][] map = new int[number][number];

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(number, map));

	}

}
