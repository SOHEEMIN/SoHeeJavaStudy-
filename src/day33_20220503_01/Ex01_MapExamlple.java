package day33_20220503_01;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapExamlple {

	public static void main(String[] args) {
		// key: 정수(int), value: 문자(String)으로 한 맵을 선언해보자.

		Map<Integer, String> map1 = new HashMap<>();
//↑맵:인터페이스/↑제네릭(꺽새) 부분엔 클래스만 가능 / ↑HashMap 구현 클래스
		// 저장
		map1.put(1, "안녕");
		map1.put(2, "안녕하세요,");
		// 값 가져오기
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));

		// key: 문자(String), value: 문자(String)
		// map2 선언하고 data저장
		Map<String, String> map2 = new HashMap<>();
		map2.put("하이", "ㅎㅎㅎ");
		map2.put("안녕", "ㅋㅋㅋ");
		map2.put("안녕", "123");
		System.out.println(map2.get("하이"));
		System.out.println(map2.get("안녕"));
		// key에 안녕값을 동일하게 줬을 시, 마지막에 입력한 값이 덮어쓰여짐

		// 반복문에 활용 keySet() : key만으로 이루어짐
		// ↓반복 타입은 key타입에 맞춤
		for (String s : map2.keySet()) {
			System.out.println(s);
			System.out.println(map2.get(s));
		}
		// 삭제
		map2.remove("하이");

	}

}
