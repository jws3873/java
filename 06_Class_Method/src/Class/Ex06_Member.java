package Class;

import java.util.Scanner;

public class Ex06_Member {

	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		m.age = 27;
		m.phone = "010-3873-2870";
		m.jop = "검사";
		m.display();
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 이름, 나이, 번호, 직업을 입력하세요.......");
		Member m2 = new Member(sc.next(),sc.nextInt(),sc.next(),sc.next());
		m2.display();
		
		System.out.println();
		sc.close();
		
		

	}

}
