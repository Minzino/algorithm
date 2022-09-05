package string;

import java.util.Scanner;

public class Problem0109 {
	public int solution(String str){
		StringBuilder answer = new StringBuilder();
		for(char x: str.toCharArray()){
			if(Character.isDigit(x))
				answer.append(x);
		}
		return Integer.parseInt(answer.toString());
	}

	public static void main(String[] args) {
		Problem0109 T = new Problem0109();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
