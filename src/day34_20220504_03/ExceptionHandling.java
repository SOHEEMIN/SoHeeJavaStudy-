package day34_20220504_03;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<>();
			list.add("안녕");
			list.add("하이");
			for (int i = 0; i <= list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			// ↑캐치 안에 내가 예외처리 할 익셉션의 type / e: 매개변수
			System.out.println("IndexOutOfBoundsException 예외 발생!!!");
			e.printStackTrace();
			// ↑원래 발생한 익셉션 호출
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("여기는 예외 발생하든 안하든 실행");
		}
		System.out.println("리스트 출력 끝");
		// try / catch가 끝난 후에 코드가 실행되기 때문에 위의 sysout은 실행됨
	}

}
