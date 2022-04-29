package khie;

import java.util.Scanner;

public class Exam05_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요.");
		String name= sc.next();
		String phoneNumber = sc.next();
		sc.nextLine();
		String address = sc.nextLine();
		String position = sc.next();
		NameCard nc = new NameCard(name, phoneNumber, address, position);
		nc.display();
		sc.close();
		
	}

}
