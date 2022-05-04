package day34_20220504_02;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestInterface interface1 = new TestInterface();
		//인터페이스는 생성가를 가지지 않기 때문에 위의같은 예시는 틀림
		
		TestInterface impl1 = new ImplClass1();
		//구현클래스의 생성자가 대입이 됨
		impl1.hello();
		impl1.hello2("바로핑");
		impl1 = new ImplClass2();
		impl1.hello();
		impl1.hello2("맛나핑");
		 
		//ImplClass1로 개발을 하다가 ImplClass2로 바꿔야 하는 경우
		ImplClass1 implc1 = new ImplClass1();
		implc1.hello();
		implc1.hello2("차차핑");
		ImplClass2 implc2 = new ImplClass2();
		implc2.hello2("해핑");
	}

}
