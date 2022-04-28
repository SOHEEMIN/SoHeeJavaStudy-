package day30_20220428_01;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

	static List<MemberDTO> memberList = new ArrayList<>();

	void save(MemberDTO mem1) {
		System.out.println(mem1);
		memberList.add(mem1);

	}
}