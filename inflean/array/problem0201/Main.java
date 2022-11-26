package array.problem0201;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public ArrayList<Integer> solution(int testCase, int[] intArr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(intArr[0]);
		for (int i = 1; i < testCase; i++) {
			if(intArr[i]>intArr[i-1]){
				answer.add(intArr[i]);
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] intArr = new int[testCase];
		for (int i = 0; i < testCase; i++) {
			intArr[i] = sc.nextInt();
		}
		for (int x : T.solution(testCase, intArr)) {
			System.out.print(x + " ");
		}
	}
}
