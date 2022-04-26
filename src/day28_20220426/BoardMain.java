package day28_20220426;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Board board1 = new Board(1, "1234", "제목", "글쓴이", "내용", 1);
		Board board2 = new Board();
		board2.boardNumber = 2;
		board2.boardPw = "4567";
		board2.boardTitle = "난 제목";
		board2.boardWritter = "난 글쓴";
		board2.boardContent = "난 내용";
		board2.boardViews = 100;

		board1.findById();
		board2.findById();

		Scanner scan = new Scanner(System.in);
		System.out.println("글번호 입력: ");
		int boardNumber = scan.nextInt();
		System.out.println("비밀번호 입력: ");
		String boardPw = scan.next();

		boolean loginResult = board1.update(boardNumber, boardPw);
		if (loginResult) {
			System.out.println("제목수정: ");
			String boardTitle = scan.next();
			System.out.println("글수정: ");
			String boardContent = scan.next();

			board1.change(boardTitle, boardContent);
			board1.findById();
		} else {
			System.out.println("수정 불가");
		}

	}

}
