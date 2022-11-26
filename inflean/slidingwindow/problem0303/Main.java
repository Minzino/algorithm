package slidingwindow.problem0303;

import java.util.Scanner;

public class Main {

	public int solution(int days, int continuous, int[] sales) {
		int tmp = 0;
		int p1 = 0;
		int p2 = continuous;

		for (int j = 0; j < continuous; j++) {
			tmp += sales[j];
		}

		int max = tmp;

		for (int i = continuous; i < days; i++) {
			tmp += sales[p2] - sales[p1];
			if (max < tmp) {
				max = tmp;
			}
			p1++;
			p2++;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main T = new Main();

		int days = sc.nextInt();
		int continuous = sc.nextInt();
		int[] sales = new int[days];

		for (int i = 0; i < days; i++) {
			sales[i] = sc.nextInt();
		}

		System.out.println(T.solution(days, continuous, sales));

	}

}
