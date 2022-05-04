package day30_20220428_01;

public class MemberDTO {
	private Long id;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private int age;
	private String memberMobile;

	MemberDTO() {

	}

	public MemberDTO(Long id, String memberId, String memberPassword, String memberName, int age, String memberMobile) {
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.age = age;
		this.memberMobile = memberMobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", memberId=" + memberId + ", memberPassword=" + memberPassword + ", memberName="
				+ memberName + ", age=" + age + ", memberMobile=" + memberMobile + "]";
	}

}