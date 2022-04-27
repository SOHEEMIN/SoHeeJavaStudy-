package day29_20220427_02;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.
		HumanDTO human1 = new HumanDTO(1L, "신짱구", 5);
		HumanDTO human2 = new HumanDTO(2L, "신짱아", 2);
		HumanDTO human3 = new HumanDTO(3L, "흰둥이", 4);
		HumanService humanService = new HumanService();

		humanService.save(human1);
		humanService.save(human2);
		humanService.save(human3);

		humanService.findAll();

		// id가 1인 사람만 조회
		// 조회한 데이터는 Service에서 출력
		// 즉, Repository로 부터 id가 1L인 HumanDTO객체를 가져옴
		humanService.findById(1L);

	}

}
