package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.MemberDTO;
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
public class Ex04 {

	public static void main(String[] args) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원 수를 입력하세요 : ");
		
		int memberCount = sc.nextInt();

		//1. 키보드로 회원 수 만큼 회원 정보를 입력받아서
		//list(ArrayList) 에 저장해 보자.
		
		for(int i =0;i<memberCount;i++) {
			System.out.print((i+1)+"번째 회원의 아이디, 이름, 나이, 연락처, 주소를 입력하세요");
			MemberDTO dto = new MemberDTO(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
			list.add(dto); //dto는 주소값
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
		
		System.out.println("아이디\t 이름\t 나이\t 연락처\t 주소");
		for(int i =0;i<list.size();i++) {
			System.out.println((i+1)+"번째 회원의"); 
			System.out.print(list.get(i).getId()+"\t ");
			System.out.print(list.get(i).getName()+"\t ");
			System.out.print(list.get(i).getAge()+"\t ");
			System.out.print(list.get(i).getPhone()+"\t ");
			System.out.print(list.get(i).getAddress()+"\t");
			System.out.println();
		}
		
		sc.close();
			
			
		}
	}


