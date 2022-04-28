package day29_20220427_02;

import java.util.List;

public class HumanService {
	HumanRepository hr = new HumanRepository();

	void save(HumanDTO human) {
		hr.save(human);
	}

	void findAll() {
		hr.findAll();
		List<HumanDTO> humanList = hr.findAll2();
		System.out.println("HumanService.findall2() for문");
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	void findById(Long id) {
		System.out.println("넘어온 id값: " + id);
		HumanDTO human = hr.findById(id);
		// Repository로부터 id가 1L인 HumanDTO객체를 가져옴
		if (human == null) {
			System.out.println("조회 결과가 없습니다.");
		} else {
			System.out.println("조회값: " + human);
		}
	}

	public void delete(Long id) // 메인에서 넘긴걸 받음
	{
		List<HumanDTO> humanList = hr.delete(id);
		System.out.println("삭제 후 리스트");
		for (HumanDTO human : humanList) {
			System.out.println(human);
		}
	}


	void modify(Long id) {
		List<HumanDTO> humanList = hr.modify(id);
		System.out.println("수정 후 ");
		for (HumanDTO human : humanList) {
			System.out.println(human);
		}
	}
	
	

}
