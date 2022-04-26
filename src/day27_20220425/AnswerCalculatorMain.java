package day27_20220425;

import java.util.Scanner;

public class AnswerCalculatorMain {

	public static void main(String[] args) {
		AnswerCalculator cal = new AnswerCalculator();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num1 = 0, num2 = 0, selectNumber = 0;
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈");
			System.out.println("-------------------------");
			System.out.println("선택>");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				System.out.println("숫자: ");
				num1 = scan.nextInt();
				System.out.println("숫자: ");
				num2 = scan.nextInt();
				cal.sum(num1, num2);
			} else if (selectNumber == 2) {
				System.out.println("숫자: ");
				num1 = scan.nextInt();
				System.out.println("숫자: ");
				num2 = scan.nextInt();
				cal.subtraction(num1, num2);
			} else if (selectNumber == 3) {
				System.out.println("숫자: ");
				num1 = scan.nextInt();
				System.out.println("숫자: ");
				num2 = scan.nextInt();
				cal.multipication(num1, num2);
			} else if (selectNumber == 4) {
				System.out.println(cal.division());
			}
		}
	}

}
