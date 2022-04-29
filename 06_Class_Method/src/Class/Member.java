package Class;

public class Member {

	//멤버변수
	String name;
	int age;
	String phone;
	String jop;
	Member() {
	}
	Member(String name,int age,String phone,String jop) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.jop = jop;
	}
		void display() {
			System.out.println("회원 이름 >>> "+name);
			System.out.println("회원 나이 >>> "+age);
			System.out.println("회원 번호 >>> "+phone);
			System.out.println("회원 직업 >>> "+jop);
		
	}
	
}
