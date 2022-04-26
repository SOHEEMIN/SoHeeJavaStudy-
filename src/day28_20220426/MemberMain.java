package day28_20220426;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member(1L, "713thgml", "1234", "민소희", "010-7777-7777", 29);
		Member member2 = new Member();
		member2.id = 2L;
		member2.memberId = "shinjjang";
		member2.memberPassword = "0000";
		member2.memberName = "신짱구";
		member2.memberPhone = "010-4444-4444";
		member2.memberAge = 05;

		// 조회(메서드호출)
		member1.findById();
		member2.findById();

		Scanner scan = new Scanner(System.in);
		System.out.println("아이디: ");
		String memberId = scan.next();
		System.out.println("비밀번호: ");
		String memberPassword = scan.next();
		boolean loginResult = member1.memberLogin(memberId, memberPassword);
		if (loginResult) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호를 확인하세요.");
		}
		System.out.println("변경할 전화번호: ");
		String memberPhone = scan.next();
		member1.update(memberPhone);
		member1.findById();
	}

}
