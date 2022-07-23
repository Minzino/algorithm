package String;

import java.util.Scanner;

public class problem0107 {

	public String solution(String str) {
		String answer = "YES";
		String upperStr = str.toUpperCase();
		int strLength = str.length();
		for (int i = 0; i < strLength / 2; i++) {
			if (upperStr.charAt(i) != upperStr.charAt(strLength - i - 1)){
				answer ="NO";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		problem0107 T = new problem0107();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
