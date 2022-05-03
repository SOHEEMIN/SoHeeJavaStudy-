package day33_20220503_01;

import java.util.HashMap;
import java.util.Map;

public class Student {

	public static void main(String[] args) {
		/*
		 * StudentDTO를 만들어서 관리번호, 이름, 전화번호, 전공필드를 만들고 main메서드에서 student객체를 담을 수 있는
		 * studentMap을 선언하여 두 학생의 정보를 map에 저장하고 반복문으로 출력해보기 key값은 관리번호를 넣기로 함.
		 */
//		private Long id;
//		private String name;
//		private String mobile;
//		private String major;

		Map<Long, StudentDTO> studentMap = new HashMap<>();
		Long id = 0L;
		StudentDTO student1 = new StudentDTO(id,"짱구","010-1111-1111","전공1");
		StudentDTO student2 = new StudentDTO(++id,"짱아","010-2222-2222","전공2");
		
		studentMap.put(id,student1);
		studentMap.put(++id,student2);
	
		for(Long s : studentMap.keySet()) {
			System.out.println(s);
			System.out.println(studentMap.get(s));
			System.out.println(studentMap.get(s).getName());

		}
	}
}
