package day29_20220427_01;

public class PhoneDTO {

	private Long id;
	private String modelName;
	private String modelnumber;
	private int price;

	// 기본생성자 먼저 만들기
	PhoneDTO() {

	}

	// 매개변수 있는 생성자
	public PhoneDTO(Long id, String modelName, String modelnumber, int price) {
		this.id = id;
		this.modelName = modelName;
		this.modelnumber = modelnumber;
		this.price = price;
	}

	// getter / setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelnumber() {
		return modelnumber;
	}

	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PhoneDTO [id=" + id + ", modelName=" + modelName + ", modelnumber=" + modelnumber + ", price=" + price
				+ "]";
	}

}
