package day27_20220425;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Member join1=new Member();
		System.out.println("-----------------");
		System.out.print("회원번호:");
		join1.memberNumber=scan.nextInt();
		System.out.print("id:");
		join1.id= scan.next();
		System.out.print("비밀번호:");
		join1.password=scan.next();
		System.out.print("이름:");
		join1.name=scan.next();
		System.out.print("전화번호:");
		join1.phoneNumber=scan.next();
		System.out.print("나이:");
		join1.age=scan.nextInt();
		
		
		
		
		System.out.println("-----------------");
		System.out.println("로그인");
		System.out.print("id");
		String id1=scan.next();
		System.out.print("비밀번호");
		String password1=scan.next();
		join1.memberLogin(id1,password1);
		boolean result =join1.memberLogin(id1,password1);
		if(result==true)
		{
			System.out.println("성공");
		}
		else if(result == false)
		{
			System.out.println("실패");
		}
		System.out.println("-----------------");
		join1.findByldPrint();
		System.out.println("-----------------");
		System.out.println("변경할 번호:");
		String phoneNumber=scan.next();
		join1.update(phoneNumber);
		join1.findByldPrint();
		System.out.println("-----------------");
	}

}

