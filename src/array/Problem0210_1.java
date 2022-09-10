package array;

import java.util.Scanner;

public class Problem0210_1 {

	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	public int solution(int number, int[][] map) {
		int answer = 0;

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				boolean flag=true;
				for (int k = 0; k < dx.length; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if (nx >= 0 && nx < number && ny >= 0 && ny < number
						&& map[nx][ny] >= map[i][j]) {
						flag=false;
						break;
					}
				}
				if(flag) {
					answer++;
				}
			}
		}
		return answer;
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
