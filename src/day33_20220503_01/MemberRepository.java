package day33_20220503_01;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
	static Map<Long, MemberDTO> memberMap = new HashMap<>();
	
	
//	선생님이 하신 save메서드 소스
//	public MemberDTO save(MemberDTO newMember) {
//		return memberMap.put(newMember.getId(), newMember);
//	}
	
	public boolean save(MemberDTO newMember, Long id) {
		memberMap.put(id, newMember);
		return true;
	}
	//
	public boolean login(String memberId, String memberPassword) {
		boolean result = false;
		for (Long m : memberMap.keySet()) {
			if (memberId.equals(memberMap.get(m).getMemberId())
					&& memberPassword.equals(memberMap.get(m).getMemberPassword())) {
				result = true;
			}
		}
		return result;
	}

	public Map<Long, MemberDTO> findAll() {

		return memberMap;
	}

	public MemberDTO findById(Long findId) {
		MemberDTO member = null;
		for (Long m : memberMap.keySet()) {
			if (findId.equals(memberMap.get(m).getId())) {
				member = memberMap.get(m);
			}
		}
		return member;
	}

	public Long loginCheck(String memberId, String memberPassword) {
		Long loginId = null;
		for (Long m : memberMap.keySet()) {
			if (memberId.equals(memberMap.get(m).getMemberId())
					&& memberPassword.equals(memberMap.get(m).getMemberPassword())) {
				loginId = memberMap.get(m).getId();
			}
		}
		return loginId;
	}

	public MemberDTO update(Long loginId, String updateMobile) {
		MemberDTO member = null;
		for(Long m : memberMap.keySet()) {
			if (loginId.equals(memberMap.get(m).getId())) {
				memberMap.get(m).setMemberMobile(updateMobile);
				member = memberMap.get(m);
			}
		}
		return member;
	}


	public void delete(Long deleteId) {
		for (Long m : memberMap.keySet()) {
			if (deleteId.equals(memberMap.get(m).getId())) {
				memberMap.remove(m);
			}
		}
	}

}
