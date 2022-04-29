package day31_20220429_01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeExample {

	public static void main(String[] args) {
		// 현재 날짜 출력하기
		LocalDate date = LocalDate.now();
		System.out.println(date); // LocalDate는 년월일만 다루는 클래스

		// 현재 시간 출력하기
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		// 현재 시간 원하는 형식으로 출력하기
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));
		System.out.println(time);
	}

}
