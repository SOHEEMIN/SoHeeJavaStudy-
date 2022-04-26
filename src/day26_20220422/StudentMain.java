package day26_20220422;

public class StudentMain {

	public static void main(String[] args) {
		// 1. 기본생성자를 활용한 객체
		Student student1 = new Student();
		student1.name="학생1";
		student1.major="전자공학";
		student1.studentNumber="09999";
		student1.age=22;
//		System.out.println(student1.name);
//		System.out.println(student1.major);
//		System.out.println(student1.studentNumber);
//		System.out.println(student1.age);
		student1.studentPrint();
		//2. 매개변수 2개인 생성자를 호출한 객체
		Student student2 = new Student("짱구", 22);
//		System.out.println(student2.name);
//		System.out.println(student2.major);
//		System.out.println(student2.studentNumber);
//		System.out.println(student2.age);
		student2.studentPrint();
		//3. 매개변수 4개인 생성자를 호출한 객체
		Student student3 = new Student("짱아", "동양화", "07777", 20);
//		System.out.println(student3.name);
//		System.out.println(student3.major);
//		System.out.println(student3.studentNumber);
//		System.out.println(student3.age);
		student3.studentPrint();

		
	}

}
