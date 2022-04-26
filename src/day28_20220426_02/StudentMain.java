package day28_20220426_02;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		// getter/setter 사용전
		// student1.id = 1L; //필드 값 지정
		// System.out.println(student1.id);

		// getter/setter 사용
		student1.setId(1L);
		System.out.println(student1.getId());
		/*
		 * student겍체에 id: 2 number: 11223344 name: 학생1 major : 컴퓨터공학
		 */
		Student student2 = new Student();
		student2.setId(2L);
		student2.setStudentNumber("11223344");
		student2.setStudentName("학생1");
		student2.setStudentMajor("컴퓨터공학");
		System.out.println(student2.getId());
		System.out.println(student2.getStudentNumber());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentMajor());

		// Student 객체를 담기 위한 list
		List<Student> studentList = new ArrayList<>();
		studentList.add(student2);
		// get
		System.out.println(studentList.get(0));
		// 0번 인덱스에 담긴 Student 객체의 id 값을 출력한다면
		System.out.println(studentList.get(0).getId());
		System.out.println(studentList.get(0).getStudentNumber());

		Student student3 = new Student();
		student3.setId(3L);
		student3.setStudentNumber("999999");
		student3.setStudentName("학생3");
		student3.setStudentMajor("전자공학");
		studentList.add(student3);
		
		//for문을 이용해서 studentList에 담긴 모든 학생의 이름만 출력
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getStudentName());
		}
		//for each 사용
		for(Student stu: studentList) {
			System.out.println(stu.getStudentName());
		}
		
	}

}
