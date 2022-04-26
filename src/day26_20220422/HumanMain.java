package day26_20220422;

public class HumanMain {

	public static void main(String[] args) {
		// Human 클래스에 대한 객체(인스턴스)생성
		Human human1 = new Human();
		// [클래스이름] [객체이름(내맘대로)] = new [클래스 생성자]
		// human1 객체에 정보를 담아봅시다.
		// 그동안 해온 하나의 메서드 안에서 모든것을 시행한 것이 절차 지향 프로그램
		// 저쪽에 있는 클래스, 이쪽에 있는 필드 등 다양한 것을 가져와서 쓰는게 객체 지향 프로그램
		System.out.println(human1.name);

		human1.name = "홍길동";
		System.out.println(human1.name);

		Human human2 = new Human();
		System.out.println(human2.name);
		// human1과 human2는 각각 다름. 같은 틀에 팥을 넣으면 팥, 슈크림을 넣으면 슈크림이 나오듯이 클래스 틀은 정해져있고
		// 그 안에 어떤것을 채우냐에 따라 결과물이 다름. 공유되는거 전혀 없음. 다 다름!
		Human human3 = new Human(" 매개변수다.");
		Human human4 = new Human(1994);

		String var1 = "변수선언";
		Human human5 = new Human(var1);

		// 필드값을 세팅하기 위해 매개변수가 있는 생성자 선언
		Human human6 = new Human("신짱구", 5, "대한민국", "남");

		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.local);
		System.out.println(human6.gender);

	}

}
