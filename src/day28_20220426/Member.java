package day28_20220426;

public class Member {
	// 필드 이름 지정시 소속을 같이 정해준다.
	long id; // 번호는 long이 대개 사용됨
	String memberId;
	String memberPassword;
	String memberName;
	String memberPhone;
	int memberAge;

	// 기본생성자
	Member() {

	}

	// 모든 필드를 매개변수로 하는 생성자
	Member(long id, String memberId, String memberPassword, String memberName, String memberPhone, int memberAge) {
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}

	// 회원조회
	void findById() {
		System.out.println(this.id);
		System.out.println(this.memberId);
		System.out.println(this.memberName);
		System.out.println(this.memberPhone);
		System.out.println(this.memberAge);

	}

	boolean memberLogin(String memberId, String memberPassword) {
		boolean loginResult = false;
		if (this.memberId.equals(memberId) && this.memberPassword.equals(memberPassword)) {
			loginResult = true;
		} else {
			loginResult = false;
		}
		return loginResult;
	}

	void update(String memberPhone) {
		this.memberPhone = memberPhone;
	}

}
