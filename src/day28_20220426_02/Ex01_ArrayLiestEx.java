package day28_20220426_02;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayLiestEx {

	public static void main(String[] args) {
		// String 객체를 담기위한 ArrayList
		List<String> list1 = new ArrayList<>();
		// 저장: add 메서드
		list1.add("ㅇㅁㅇ");
		list1.add("ㅇㅅㅇ");
		list1.add(1, "ㅎㅎ"); // 1은 특정인덱스 번호, ㅎㅎ은 담고자하는 데이터. 1로 인덱스로 밀면 기존 1번 인덱스는 뒤로 밀려남
		list1.add(1, "ㅋㅋ");

		// add에 담은 것을 꺼내기: get 메서드
		System.out.println(list1.get(0));
		System.out.println(list1.get(1)); // 배열과 다르게 크기 지정 없이 넣는만큼 늘어남
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));

		// 크기확인: size 메서드
		System.out.println(list1.size());

		// 삭제:remove 메서드
		System.out.println(list1.get(1)); // 배열과 다르게 크기 지정 없이 넣는만큼 늘어남
		list1.remove(1);
		System.out.println(list1.get(1));

		// for문을 이용하여 list에 담긴 내용 모두 출력하기
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("------------------");
		// for each
		for (String a : list1) {
			System.out.println(a);
		}
		System.out.println("------------------");

		// 정수를 담는 list
		// Wrapper Class란? 감싸는 클래스. 기본형 타입은 다 Wrapper Class제공
		// int - Integer, long - Long, double - Double, boolean - Boolean
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		for (Integer num : list2) {
			System.out.println(num);
		}

	}
}
