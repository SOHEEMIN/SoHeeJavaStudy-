package day28_20220426;

public class Board {

	int boardNumber;
	String boardPw;
	String boardTitle;
	String boardWritter;
	String boardContent;
	int boardViews;

	// 기본생성자
	Board() {

	}

	// 모든 정보를 매개변수로 전달하여 필드값 지정하기
	Board(int boardNumber, String boardPw, String boardTitle, String boardWritter, String boardContent,
			int boardViews) {
		this.boardNumber = boardNumber;
		this.boardPw = boardPw;
		this.boardTitle = boardTitle;
		this.boardWritter = boardWritter;
		this.boardContent = boardContent;
		this.boardViews = boardViews;
	}

	void findById() {
		System.out.println(this.boardNumber);
		System.out.println(this.boardPw);
		System.out.println(this.boardTitle);
		System.out.println(this.boardWritter);
		System.out.println(this.boardContent);
		System.out.println(this.boardViews + 1);
	}

	boolean update(int boardNumber, String boardPw) {
		if (this.boardNumber == boardNumber && this.boardPw.equals(boardPw)) {
			return true;
		} else {
			return false;
		}
	
	}
	void change(String boardContent, String boardTitle) {
		this.boardTitle=boardTitle;
		this.boardContent = boardContent;
	}
}
