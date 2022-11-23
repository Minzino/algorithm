package sort.Problem0606;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public String solution(int number, int[] numberArr) {
		int[] tmp = numberArr.clone();
		StringBuilder sb = new StringBuilder();
		Arrays.sort(tmp);

		for (int i = 0; i < number; i++) {
			if (tmp[i] != numberArr[i]) {
				sb.append(i + 1).append(" ");
			}
		}
		return String.valueOf(sb);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main t = new Main();

		int number = sc.nextInt();
		int[] numberArr = new int[number];

		for (int i = 0; i < number; i++) {
			numberArr[i] = sc.nextInt();
		}

		System.out.print(t.solution(number, numberArr));

	}

}
