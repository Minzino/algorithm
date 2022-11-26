package string.problem0102;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}
			if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}
		}

		return String.valueOf(sb);
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));
	}
}
