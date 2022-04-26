package day27_20220425;

public class CalculatorMain {

	public static void main(String[] args) {

		// add1 메서드를 호출
		Calculator cal = new Calculator();
		// 리턴이 있는 메서드를 호출할 때는 호출결과 처리를 위한 코드가 필요
		int result = cal.add1();
		System.out.println(result);

		// add2 메서드를 호출
		result = cal.add2(10, 20);
		System.out.println(result);

		// add 2-1
		int a = 10;
		int b = 20;
		result = cal.add2(a, b);
		System.out.println(result);

		// add3 메서드를 호출(return이 없는 메서드)
		cal.add3();

		// add4 메서드를 호출(return이 없는 메서드)
		cal.add4(a, b);

		String strResult = cal.add5();
		System.out.println(strResult);
		
		
		//add6
		strResult = cal.add6("안녕", 5);
		System.out.println(strResult);
		
		//add7
		boolean booleanResult  = cal.add7(10, 0);
		System.out.println(booleanResult);
	}

}
