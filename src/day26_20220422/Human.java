package day26_20220422;

public class Human {
	// class이름이 DB의 테이블 / 휴먼이 가지고 있는 속성인 field가 DB의 컬럼
	// class는 틀을 만드는 것, 이걸 이용해서 main class에서 객체를 만듦.
	// 어떤 객체를 표현하고자 하는 클래스 시작!
	// 사람의 속성: 이름, 나이, 성별, 지역

	String name = "";
	int age = 0;
	String local = "";
	String gender = "";

	// 생성자 선언
	Human() {
		System.out.println("생성자 호출됨");
	}

	// 매개변수가 있는 생성자
	// 어떤 특정 생성자를 만들면 기본생성자는 사라지게 됨
	Human(String str1) {
		System.out.println("이것은" + str1);
	}

	// int매개변수가 있는 생성자
	Human(int num1) {
		System.out.println("넘겨받은 값은" + num1);
	}

	// 필드값을 세팅하기 위해 매개변수가 있는 생성자 선언
	Human(String name, int age, String local, String gender) {
		System.out.println("매개변수 있는 생성자");
		System.out.println(name);
		System.out.println(age);
		System.out.println(local);
		System.out.println(gender);
		this.name = name;
		this.age = age;
		this.local = local;
		this.gender = gender;

	}
	// 매개변수로 전달받은 값을 필드에 저장

}
