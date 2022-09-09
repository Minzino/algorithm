package array;

import java.util.Scanner;

public class Problem0210_1 {

	public int solution(int number, int[][] map) {
		int result = 0;
		int[][] colCheck = new int[number][number];
		int[][] rowCheck = new int[number][number];
		for (int i = 0; i < number; i++) {
			for (int j = 1; j < number; j++) {
				if (map[i][j - 1] < map[i][j]) {
					rowCheck[i][j - 1] = 0;
					rowCheck[i][j] = 1;

				} else {
					if (j > 1) {
						if (rowCheck[i][j - 2] == 1 && rowCheck[i][j - 1] == 0) {
							rowCheck[i][j - 1] = 0;
							rowCheck[i][j] = 0;
							continue;
						}
						if (rowCheck[i][j - 2] == 0 && rowCheck[i][j - 1] == 0) {
							rowCheck[i][j - 1] = 0;
							rowCheck[i][j] = 0;
							continue;
						}
					}
					rowCheck[i][j - 1] = 1;
					rowCheck[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < number; i++) {
			for (int j = 1; j < number; j++) {
				if (map[j - 1][i] < map[j][i]) {
					colCheck[j - 1][i] = 0;
					colCheck[j][i] = 1;
				} else {
					if (j > 1) {
						if (colCheck[j - 2][i] == 1 && colCheck[j - 1][i] == 0) {
							colCheck[j - 1][i] = 0;
							colCheck[j][i] = 0;
							continue;
						}
						if (colCheck[j - 2][i] == 0 && colCheck[j - 1][i] == 0) {
							colCheck[j - 1][i] = 0;
							colCheck[j][i] = 0;
							continue;
						}

					}
					colCheck[j - 1][i] = 1;
					colCheck[j][i] = 0;
				}
			}
		}
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (colCheck[i][j] == rowCheck[i][j] && rowCheck[i][j] == 1
					&& colCheck[i][j] == 1) {
					result++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem0210_1 T = new Problem0210_1();

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
