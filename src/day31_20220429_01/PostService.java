package day31_20220429_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
// java.util.*;

public class PostService {

	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	static int postHits = 0;
	PostRepository pr = new PostRepository();

	public void save() {
		System.out.println("제목: ");
		String postTitle = scan.nextLine();
		System.out.println("작성자: ");
		String postWriter = scan.nextLine();
		System.out.println("비밀번호: ");
		String postPass = scan.nextLine();
		System.out.println("글내용: ");
		String postContents = scan.nextLine();

		LocalDateTime postTime = LocalDateTime.now();
		String postDate = postTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));
		System.out.println("현재시각:" + postDate);

		PostDTO newPost = new PostDTO(++id, postTitle, postWriter, postPass, postContents, 0, postDate);
		boolean saveResult = pr.save(newPost);
		if (saveResult) {
			System.out.println("글 등록 완료");
		} else {
			System.out.println("글 등록 실패");
		}

	}

	public void findAll() {
		System.out.println("글 목록");  
		List<PostDTO> postList = pr.findAll();
		for (PostDTO p : postList) {
			System.out.println(p);
		}

	}

	public void findById() {
		System.out.println("글 조회");
		System.out.println("조회할 글 번호 입력:");
		Long findId = scan.nextLong();
		int plus = 0;
		PostDTO post = pr.findById(findId, plus);
		if (post == null) {
			System.out.println("조회결과가 없습니다.");
		} else {
			System.out.println(post);
		}
	}

	public void update() {
		System.out.println("글 수정");
		System.out.println("글 번호: ");
		Long id = scan.nextLong();
		System.out.println("비밀번호: ");
		String postPass = scan.next();
		long loginId = pr.loginCheck(id, postPass);
		if (loginId != 0) {
			System.out.println("변경할 글 제목: ");
			String updateTitle = scan.next();
			System.out.println("변경할 글 내용: ");
			String updateContents = scan.next();
			PostDTO updatePost = pr.update(loginId, updateTitle, updateContents);
			System.out.println("수정 후 게시물: " + updatePost);
		} else {
			System.out.println("글 번호 혹은 비밀번호가 틀립니다.");
		}
	}

	public void search() {
		System.out.println("글쓴이 닉네임 검색: ");
		String writer = scan.next();
		PostDTO post = pr.search(writer);
		if (post == null) {
			System.out.println("잘못 입력하셨습니다.");

		}
	}
	public void delete() {
		System.out.println("삭제할 글번호 입력: ");
		Long deletdId = scan.nextLong();
		pr.delete(deletdId);
		findAll();
	}
}