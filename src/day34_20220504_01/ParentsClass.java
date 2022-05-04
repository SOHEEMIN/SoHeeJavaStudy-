package day34_20220504_01;

public class ParentsClass {

	public String name;
	public String address;

	ParentsClass() {
		System.out.println("부모 기본생성자");
	}

	ParentsClass(String name, String address) {
		System.out.println("부모 매개변수 생성자");
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ParentsClass [name=" + name + ", address=" + address + "]";
	}
	public void hello() {
		System.out.println("부모 hello 메서드");
	}
}
