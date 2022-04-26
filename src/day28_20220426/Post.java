package day28_20220426;

import java.util.Scanner;

public class Post {
	long id;
	String postPass;
	String postTitle;
	String postWriter;
	String postContents;
	int postHits;

	public Post() {
	}

	public Post(long id, String postPass, String postTitle, String postWriter, String postContents, int postHits) {

		this.id = id;
		this.postPass = postPass;
		this.postTitle = postTitle;
		this.postWriter = postWriter;
		this.postContents = postContents;
		this.postHits = postHits;
	}

	void findById() {
		postHits = postHits + 1;
		System.out.println(id);
		System.out.println(postPass);
		System.out.println(postTitle);
		System.out.println(postWriter);
		System.out.println(postContents);
		System.out.println(postHits);

	}

	void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("글번호:");
		long id = scan.nextLong();
		System.out.println("비밀번호:");
		String postPass = scan.next();
		scan.nextLine();
		if (this.id == id && this.postPass.equals(postPass)) {
			System.out.println("수정제목:");
			String updateTitle = scan.nextLine();
			System.out.println("수정내용:");
			String updateContents = scan.nextLine();
			this.postTitle = updateTitle;
			this.postContents = updateContents;
		} else {
			System.out.println("비밀번호가 틀려요");
		}
	}

}