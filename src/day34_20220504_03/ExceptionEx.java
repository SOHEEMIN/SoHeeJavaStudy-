package day34_20220504_03;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		/*
		 * 숫자/0을 했을 때 발생하는 예외를 확인하여 이에 대한 예외처리 코드를 작성해봅시다.
		 */
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		try {
			System.out.println(x / 0);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생!!!");
		} finally {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
