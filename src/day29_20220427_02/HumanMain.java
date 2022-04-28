package day29_20220427_02;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.
		HumanDTO human1 = new HumanDTO(1L, "신짱구", 5);
		HumanDTO human2 = new HumanDTO(2L, "신짱아", 2);
		HumanDTO human3 = new HumanDTO(3L, "흰둥이", 4);

		HumanService humanService = new HumanService();

		// 이러한 방식도 있음!
		HumanDTO human = new HumanDTO(1L, "사람1", 11);
		humanService.save(human);
		human = new HumanDTO(2L, "사람2", 22);
		humanService.save(human);
		human = new HumanDTO(3L, "사람3", 33);
		humanService.save(human);

		humanService.save(human1);
		humanService.save(human2);
		humanService.save(human3);

		humanService.findAll();

		// id가 1인 사람만 조회
		// 조회한 데이터는 Service에서 출력
		// 즉, Repository로 부터 id가 1L인 HumanDTO객체를 가져옴
		humanService.findById(4L);

		// id가 2인 사람 삭제
		// 삭제 후 리스트를 가져와서 Service에서 출력
		humanService.delete(2L);

		// id가 3인 사람의 이름을 자바왕으로 바꾸자.
		humanService.modify(3L);

	}

}
