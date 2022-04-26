package day28_20220426;

import java.util.Scanner;

public class PostMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNumber = 0;
		long id = 0L;// 글번호를 위한 변수
		Post post1 = null;
		Post post2 = null;
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.글등록|2.글등록(기본생성자)|3.글조회|4.글수정|5.종료");
			System.out.println("--------------------------------");
			System.out.println("선택>");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				post1 = new Post(1L, "1234", "제목1", "작성자1", "내용내용", 0);
			} else if (selectNumber == 2) {
				post2 = new Post();
				post2.id = ++id;
				post2.postPass = "3333";
				post2.postTitle = "제목2";
				post2.postWriter = "작성자2";
				post2.postContents = "내용내용";
				post2.postHits = 0;
			} else if (selectNumber == 3) {
				post1.findById();
				post2.findById();
			} else if (selectNumber == 4) {
				post1.update();
			}
		}

	}

}
