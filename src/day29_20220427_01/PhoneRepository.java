package day29_20220427_01;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {

	static List<PhoneDTO> phoneList = new ArrayList<>();

	void save(PhoneDTO phone) {
		System.out.println("PhoneRepository.save()");
		System.out.println(phone);
		phoneList.add(phone);
	}

	void findAll() {
		System.out.println("PhoneRepository.findAll()");
		for (PhoneDTO p : phoneList) {
			System.out.println(p);
		}
	}

	// findAll1메서드 정의
	// 리턴: phoneList
	List<PhoneDTO> findAll1() {
		return phoneList;
	}
}
