package inflean.string;

import java.util.Scanner;

public class Problem0112 {

	private String solution(int strLength, String str) {
		String answer = "";
		for (int i = 0; i < strLength; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char) num;
			str = str.substring(7);
		}
		return answer;
	}

	public static void main(String[] args) {
		Problem0112 T = new Problem0112();
		Scanner sc = new Scanner(System.in);
		int strLength = sc.nextInt();
		String str = sc.next();

		System.out.println(T.solution(strLength, str));

	}

}
