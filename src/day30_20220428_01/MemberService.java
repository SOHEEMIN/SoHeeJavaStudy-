package day30_20220428_01;

import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in);

	MemberRepository mem = new MemberRepository();

	void save(MemberDTO member) {

		boolean run = true;
		int i = 0;

		while (run) {
			System.out.println("------------------------");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원목록 | 4. 상세조회 | 5. 회원정보수정 | 6. 회원삭제 | 7. 종료");
			System.out.println("------------------------");
			System.out.println("번호를 입력: ");
			i = scan.nextInt();
			if (i == 1) {
				System.out.println("1. 회원가입");
				System.out.println("아이디를 입력하세요.");
				String setMemberId = scan.next();
				System.out.println("비밀번호를 입력하세요.");
				String setMemberPassword = scan.next();
				System.out.println("이름을 입력하세요.");
				String setMemberName = scan.next();

				mem.save(member);

			}
		}
	}
}
