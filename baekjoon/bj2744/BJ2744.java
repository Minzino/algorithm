package bj2744;

import java.util.Scanner;

public class BJ2744 {
	public String solution(String str){
		String answer = "";
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)){
				answer += Character.toUpperCase(x);
			}
			if(Character.isUpperCase(x)){
				answer += Character.toLowerCase(x);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		BJ2744 T = new BJ2744();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}
