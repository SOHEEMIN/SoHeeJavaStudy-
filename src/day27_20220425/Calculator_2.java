package day27_20220425;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Calculator_2 {
	Scanner scan = new Scanner(System.in);

//	2. 객체 프로그래밍 연습(계산기 예제)
//    1. 사칙연산(+, -, *, /)을 할 수 있는 계산기 
//    2. Calculator Class
//        1. sum 메서드 
//            1. 매개변수: 정수형 변수 2개
//            2. 리턴타입: 없음 
//            3. 실행내용: 덧셈 결과 출력
	void number1(int num1, int num2) {
		int sum = 0;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		sum = num1 + num2;
		System.out.println("입력 받은 값의 합은" + sum);
	}

//        2. subtraction 메서드 
//            1. 매개변수: 정수형 변수 2개 
//            2. 리턴타입: 없음
//            3. 실행내용: 뺄셈 결과 출력
	void number2(int num1, int num2) {
		int subtraction = 0;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		subtraction = num1 - num2;
		System.out.println("입력받은 값의 차는" + subtraction);

	}

//        3. multiplication 메서드 
//            1. 매개변수: 정수형 변수 2개
//            2. 리턴타입: 정수
//            3. 실행내용: 곱셈후 곱셈 결과 리턴 
	int number3(int num1, int num2) {
		int multiplication = 0;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		multiplication = num1 * num2;
		return multiplication;
	}

//        4. division 메서드 
//            1. 매개변수: 없음
//            2. 리턴타입: 정수
//            3. 실행내용: 스캐너로 정수 2개 입력 받고 나눗셈 결과 리턴 
	int number4() {
		System.out.println("두개의 값을 입력하시오.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int division = num1 / num2;
		System.out.println("입력받은 값의 몫은" + division);
		return division;

	}

}