package baekjoon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.TimeZone;

/*
https://www.acmicpc.net/problem/10699
서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
 */

public class bj10699 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.println(df.format(date));
	}
}
