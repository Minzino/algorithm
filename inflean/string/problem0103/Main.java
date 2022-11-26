package string.problem0103;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		String answer = "";
		String[] s = str.split(" ");
		int min = Integer.MIN_VALUE;
		for (String x : s) {
			int length = x.length();
			if (length > min) {
				min = length;
				answer = x;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
