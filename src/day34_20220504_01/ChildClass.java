package day34_20220504_01;

public class ChildClass extends ParentsClass {
	ChildClass() {
		System.out.println("자식 기본생성자");
	}

	ChildClass(String name, String address) {
		System.out.println("자식 매개변수 생성자");
		this.name = name;
		this.address = address;
		// 부모로부터 상속받은 name, address을 가리킴

	}
		//메서드 오버라이딩 (재정의)
//	@Override
//	public void hello() {
//		System.out.println("자식 hello 메서드");
//	}
}
