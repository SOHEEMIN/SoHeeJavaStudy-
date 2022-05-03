package day33_20220503_01;

public class StudentDTO {

	private Long id;
	private String name;
	private String mobile;
	private String major;
	
	StudentDTO(){
		
	}

	public StudentDTO(Long id, String name, String mobile, String major) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.major = major;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", mobile=" + mobile + ", major=" + major + "]";
	}
	
	
}
