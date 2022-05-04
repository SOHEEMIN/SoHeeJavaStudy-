package day34_20220504_01;
import java.util.*;
public class Temp {

	public static void main(String[] args) {
		Map<Long, String> testMap = new HashMap<>();
		System.out.println(testMap.put(1L, "안녕"));
		System.out.println(testMap.put(2L, "하이"));
		//맵에 put을 했을 때 정상적으로 진행된다면 return은 null값이 나옴

		System.out.println(testMap.put(1L, "안녕하세요."));
		//기존의 키에 새로운 값을 넣었을 때는, 그 이전에 넣었던 값이 출력됨
		System.out.println(testMap.put(1L, "ㅎㅇ"));
	}

}
