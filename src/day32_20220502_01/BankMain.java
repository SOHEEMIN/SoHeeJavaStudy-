package day32_20220502_01;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int selectNumber = 0;
		BankService bs = new BankService();
		while (run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.신규고객등록 | 2.잔액조회 | 3.입금 | 4.출금 | 5.거래내역확인 | 6.종료");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("선택> ");
			selectNumber = scan.nextInt();
			if (selectNumber == 0) {
				bs.findAll();
			}
			if (selectNumber == 1) {
				bs.save();
			}
			if (selectNumber == 2) {
				bs.findById();
			}
			if (selectNumber == 3) {
				bs.depositMoney();
			}
			if (selectNumber == 4) {
				// bs.withdrawMoney();
			}
		}

	}

}
