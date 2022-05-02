package day32_20220502_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class BankService {

	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	BankRepository br = new BankRepository();

	public void save() {
		System.out.println("고객이름: ");
		String clientName = scan.next();
		System.out.println("비밀번호: ");
		int clientPass = scan.nextInt();
		System.out.println("계좌번호: ");
		int accountNumber = scan.nextInt();

		LocalDateTime joinDate = LocalDateTime.now();
		String clientCreateDate = joinDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		ClientDTO newJoin = new ClientDTO(++id, clientName, clientPass, clientCreateDate, 0, accountNumber);
		boolean saveResult = br.save(newJoin);

		if (saveResult) {
			System.out.println("신규고객등록완료");
		}
	}

	public void findAll() {
		List<ClientDTO> clientList = br.findAll();
		for (ClientDTO p : clientList) {
			System.out.println(p);
		}
	}

	public void findById() {
		System.out.println("잔액조회");
		System.out.println("조회할 계좌번호 입력: ");
		int account = scan.nextInt();
		int balance = 0;
		ClientDTO post = br.findById(account, balance);
		if (post == null) {
			System.out.println("일치하는 계좌가 없습니다.");
		} else {
			System.out.println("조회하신 계좌의 잔액은" + balance + "원 입니다.");
			System.out.println(post);
		}
	}

	public void depositMoney() {
		int balance=0;
		System.out.println("고객이름: ");
		String clientName = scan.next();
		System.out.println("계좌번호: ");
		int accountNumber = scan.nextInt();
		System.out.println("입금액: ");
		int deposit = scan.nextInt();
		Long loginId = br.depositMoney(accountNumber, balance);
		if (loginId != null) {
			balance += deposit;
			System.out.println(balance);
		} else {
			System.out.println("해당 계좌와 일치하는 계좌가 없습니다.");
		}
		findAll();
	}

//	public void withdrawMoney() {
//		int balance = 0;
//		System.out.println("계좌번호: ");
//		int accountNumber = scan.nextInt();
//		System.out.println("비밀번호: ");
//		int clientPass = scan.nextInt();
//		System.out.println("출금액: ");
//		int deposit = scan.nextInt();		

}
