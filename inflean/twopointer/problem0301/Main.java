package twopointer.problem0301;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public List<Integer> solution(int firstLength, int secondLength, int[] firstArr,
		int[] secondArr) {
		List<Integer> result = new ArrayList<>();
		int p1 = 0, p2 = 0;

		while (p1 < firstLength && p2 < secondLength) {
			if (firstArr[p1] < secondArr[p2]) {
				result.add(firstArr[p1++]);
			} else {
				result.add(secondArr[p2++]);
			}
		}
		while (p1 < firstLength) {
			result.add(firstArr[p1++]);
		}
		while (p2 < secondLength) {
			result.add(secondArr[p2++]);
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Main T = new Main();

		int firstLength = sc.nextInt();
		int[] firstArr = new int[firstLength];

		for (int i = 0; i < firstLength; i++) {
			firstArr[i] = sc.nextInt();
		}

		int secondLength = sc.nextInt();
		int[] secondArr = new int[secondLength];

		for (int i = 0; i < secondLength; i++) {
			secondArr[i] = sc.nextInt();
		}

		for (int result : T.solution(firstLength, secondLength, firstArr, secondArr)) {
			System.out.print(result + " ");
		}
	}

}
