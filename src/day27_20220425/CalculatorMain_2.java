package day27_20220425;

import java.util.Scanner;

public class CalculatorMain_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Calculator_2 cal = new Calculator_2();

//	 3. CalculatorMain Class 
// 1. 프로그램을 실행하면 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료 선택창이 출력됨 (while 문 활용)
// 2. 각 메서드 정의에 맞게 호출하여 결과를 출력한다. 
//     1. 덧셈 메서드 sum 호출  
//     2. 뺄셈 메서드 subtraction 호출 
//     3. 곱셈 메서드 multiplication 호출 
//     4. 나눗셈 메서드 division 호출

		while (true) {
			System.out.println("1. 덧셈" + "\t" + "2.뺄셈" + "\t" + "3.곱셈" + "\t" + "4.나눗셈" + "\t" + "5.종료");
			int i = scan.nextInt();

			if (i == 1) {
				cal.number1(1, 2);
			} else if (i == 2) {
				cal.number2(2, 3);
			} else if (i == 3) {
				cal.number3(2, 3);
			} else if (i == 4) {
				cal.number4();
			} else if (i == 0) {
				break;
			}

		}

	}
}