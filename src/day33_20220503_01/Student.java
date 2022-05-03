package day33_20220503_01;

import java.util.HashMap;
import java.util.Map;

public class Student {

	public static void main(String[] args) {

		Map<Long, StudentDTO> studentMap = new HashMap<>();
		Long id = 0L;
		StudentDTO student1 = new StudentDTO(id, "짱구", "010-1111-1111", "전공1");
		StudentDTO student2 = new StudentDTO(++id, "짱아", "010-2222-2222", "전공2");

		studentMap.put(id, student1);
		studentMap.put(++id, student2);

		for (Long s : studentMap.keySet()) {
			System.out.println(s);
			System.out.println(studentMap.get(s));
			System.out.println(studentMap.get(s).getName());

		}
	}
}
