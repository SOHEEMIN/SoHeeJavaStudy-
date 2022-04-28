package day29_20220427_02;

import java.util.*;

public class HumanRepository {

	static List<HumanDTO> humanList = new ArrayList<>();

	void save(HumanDTO hum) {
		System.out.println("HumanRepository.save()");
		System.out.println(hum);
		humanList.add(hum);
		System.out.println("-----------------");
	}

	void findAll() {
		System.out.println("HumanRepository.findAll()");
		for (HumanDTO h : humanList) {
			System.out.println(h);

		}
		System.out.println("-----------------");

	}

	List<HumanDTO> findAll2() {
		return humanList;
	}

	HumanDTO findById(Long id) {
		// id값과 일치하는 객체를 찾음.
		// 한명의 정보를 찾아야 하기 때문에 리턴할 때 HumanDTO객체가 필요
		HumanDTO human = null;
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;

	}

	List<HumanDTO> delete(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
		return humanList;
	}

	List<HumanDTO> modify(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.get(i).setName("자바왕");
			}
		}
		return humanList;

	}

}
