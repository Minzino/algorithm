package string.problem0109;

import java.util.Scanner;

public class Main {
	public int solution(String str){
		StringBuilder answer = new StringBuilder();
		for(char x: str.toCharArray()){
			if(Character.isDigit(x))
				answer.append(x);
		}
		return Integer.parseInt(answer.toString());
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
