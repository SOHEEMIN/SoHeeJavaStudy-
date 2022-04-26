package day27_20220425;

public class Calculator {

	/*
	 * 모든 덧셈 메서드는, 10, 20의 합을 구한다.
	 * 
	 * 1. 리턴타입: int / 메서드이름: add1 / 매개변수없음
	 */

	int add1() {
		int a = 10;
		int b = 20;
		return a + b;
	}

	/*
	 * 2. 리턴타입: int / 메서드이름: add2 / 매개변수: int 타입 2개
	 */

	int add2(int a, int b) {
		return a + b;

	}

	/*
	 * 3. 리턴타입: 없음 / 매서드 이름: add3 / 매개변수: 없음
	 */
	void add3() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	/*
	 * 4. 리턴타입: 없음 / 매서드 이름: add4 / 매개변수: int타입 2개
	 */
	void add4(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println(sum);
	}

	/*
	 * 5. 리턴타입: String / 메서드 이름: add5 / 매개변수: 앖음
	 */
	String add5() {
		return "ㅇㅅㅇ?";
	}

	/*
	 * 6. 리턴타입: String / 메서드이름: add6 매개변수: String 1개, int 타입 1개 실행내용: String값은 뒤에 !!
	 * 를 추가해서 리턴, int 값은 단순 출력만.
	 */

	String add6(String str, int a) {
		System.out.println(a);
		String result = str + "!!";
		return result;
	}

	/*
	 * 7. 리턴타입: boolean / 매서드이름: add7 매개변수: int 타입 2개 실행내용: 매개변수 2개의 합이 10보다 크거나 같다면
	 * true 10보다 작으면 false
	 */
	boolean add7(int a, int b) {
		int sum = a + b;
		if (sum >= 10) {
			return true;
		} else {
			return false;
		}
	}

}
