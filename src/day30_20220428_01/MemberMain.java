package day30_20220428_01;

public class MemberMain {

	public static void main(String[] args) {
		MemberDTO member1 = new MemberDTO();
		MemberService memberService = new MemberService();
		memberService.save(member1);

		
	}

}
