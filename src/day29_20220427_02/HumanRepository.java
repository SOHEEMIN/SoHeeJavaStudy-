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
			
		}System.out.println("-----------------");

	}

	List<HumanDTO> findAll2() {
		return humanList;
	}
	HumanDTO findById(Long id) {
		HumanDTO human = new HumanDTO();
		for(int i=0; i<humanList.size();i++) {
			if(id.equals(humanList.get(i).getId())){
				human = humanList.get(i);
			}
		}
		return human;
	}

}
