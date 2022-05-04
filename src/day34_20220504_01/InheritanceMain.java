package day34_20220504_01;

public class InheritanceMain {

	public static void main(String[] args) {
		// 부모 클래스 객체
		ParentsClass parents1 = new ParentsClass();
		ParentsClass parents2 = new ParentsClass("하츄핑", "인천");

		// 자식 클래스 객체
		ChildClass child1 = new ChildClass();
		// 클래스 생성할 때 기본으로 기본생성자가 생성되기 때문
		ChildClass child2 = new ChildClass("방글핑", "서울");

		// 부모가 가지고 있는 hello메서드 호출
		child1.hello();
		System.out.println(child1.getName());
		System.out.println(child2.getName());
		System.out.println(child1.name);
		System.out.println(child2.name);
	}

}
