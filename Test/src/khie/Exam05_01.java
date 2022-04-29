package khie;

import java.util.Scanner;

public class Exam05_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 성별(male/female), 나이를 입력하세요.");
		String name = sc.next();
		String gender = sc.next();
		int age = sc.nextInt();
		Person person = new Person(name, gender, age);
		person.display();
		sc.close();
	}

}
