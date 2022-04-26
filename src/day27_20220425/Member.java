package day27_20220425;


	public class Member {
		int memberNumber;
		String id;
		String password;
		String name;
		String phoneNumber;
		int age;
		
		Member(){}
		
		
		void save(int memberNumber,String id,String password,
					String name,String phoneNumber,int age)
		{
			this.memberNumber = memberNumber;
			this.id = id;
			this.password = password;
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.age = age;
		}
		
		boolean memberLogin(String id,String password)
		{
			if (id.equals(this.id) && password.equals(this.password))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		void findByldPrint()
		{
			System.out.print("회원번호:");
			System.out.println(this.memberNumber);
			System.out.print("id:");
			System.out.println(this.id );
			System.out.print("비밀번호:");
			System.out.println(this.password);
			System.out.print("이름:");
			System.out.println(this.name);
			System.out.print("전화번호:");
			System.out.println(this.phoneNumber);
			System.out.print("나이:");
			System.out.println(this.age);
			
		}
		
		void update(String phoneNumber)
		{
			this.phoneNumber=phoneNumber;
		}
	}
