package packages;
/*
 * [문제] 회원수를 키보드로 입력받아서 회원수 만큼
 * 객체 배열에 회원의 정보를 입력받아서 화면에 출력해 보자.
 */
import java.util.Scanner;

import Model.MemberDTO;

public class Ex02 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		//1. 회원수를 키보드로 입력을 받아서 객체 배열에 회원수를 입력해 보자.
		System.out.print("회원수를 입력해 주세요 : ");
		MemberDTO[] dto = new MemberDTO[sc.nextInt()];
		
		//2. 반복문을 이용하여 회원 수 만큼 회원 정보를 키보드로 입력을 받자.
		
		for(int i = 0;i<dto.length;i++) {
			System.out.print((i+1)+"번째 회원 아이디, 이름, 나이, 핸드폰 번호, 주소를 입력하세요 : ");
			dto[i] = new MemberDTO(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next()+sc.nextLine());
//			dto[i].setId(sc.next());
//			dto[i].setName(sc.next());
//			dto[i].setAge(sc.nextInt());
//			dto[i].setPhone(sc.next());
//			dto[i].setAddress(sc.nextLine());
		}
		System.out.println();
		
		for(int i = 0;i<dto.length;i++) {
			System.out.println((i+1)+"번째회원");
			System.out.println("아이디 >>>  "+dto[i].getId());
			System.out.println("이름 >>>  "+dto[i].getName());
			System.out.println("나이 >>>  "+dto[i].getAge());
			System.out.println("핸드폰 번호 >>>  "+dto[i].getPhone());
			System.out.println("주소 >>>  "+dto[i].getAddress());
			System.out.println();
		}
		sc.close();
	}

}
