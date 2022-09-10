package inflean.string;

import java.util.Scanner;

/*
멋쟁이 숫자
숫자로만 이루어진 문자열 s가 있습니다.
(0 <= s.length < 1,000)

아래의 조건을 모두 만족하는 숫자를 '멋쟁이 숫자'라고 합니다.

[조건]
1. 길이가 3인 s의 substring을 10진수로 읽은 숫자이다.
2. 각 자리의 숫자가 모두 같다.

구현사항
문자열s를 입력받아 멋쟁이 숫자를 리던하는 함수를 만들어주세요.
만약, 멋쟁이 숫자가 여러 개 존재하는 경우에는 가장 큰 수를 리턴합니다.
만약, 가장 큰 멋쟁이 숫자가 000이라면 0을 리턴합니다.
만약, 멋쟁이 숫자가 존재하지 않다면 -1을 리턴합니다.

예시1
입력: s = "12223"
출력: 222

예시2
입력: s = "111999333"
출력: 999

예시3
입력: s = "123"
출력: -1
 */

public class toss2022_1 {

	public int solution(String numbers) {
		int answer = -1;
		int max;
		for (int i = 2; i < numbers.length(); i++) {
			if (numbers.charAt(i) == numbers.charAt(i - 1)
				&& numbers.charAt(i - 1) == numbers.charAt(i - 2)) {
				max = Integer.parseInt(numbers.substring(i - 2, i + 1));
				if(max > answer) {
					answer = max;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		toss2022_1 T = new toss2022_1();
		Scanner sc = new Scanner(System.in);

		String numbers = sc.next();
		System.out.println(T.solution(numbers));
	}

}
