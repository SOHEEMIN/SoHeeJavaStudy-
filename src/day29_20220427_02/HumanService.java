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
		HumanDTO human = hr.findById(id);

		System.out.println("조회값: " + human);
	}

}
