package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.StudentDTO;

/*
 * [문제] Ex04 클래스 처럼 키보드로 학생 수를 입력을 받고
 * 입력받은 학생 수 만큼의 정보를 키보드로 입력을 받아서 ArrayList에 정보를 저장 후 화면에 출력해 보세요.
 * (단,학생의 정보는 학번, 이름, 학과, 연락처, 주소) 객체를 생성할 것, 멤버는 private, 인자생성자로 집어넣기
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		System.out.print("학생 수를 입력하세요 : ");
		int studetCount = sc.nextInt();

		
		for(int i =0;i<studetCount;i++) {
			System.out.print((i+1)+"번째 학생의 학번, 이름, 학과, 연락처, 주소를 입력하세요");
			StudentDTO dto = new StudentDTO(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next());
			list.add(dto);
			System.out.println("dto["+i+"] : "+dto);
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
		}
		
		System.out.println("\t 학번\t 이름\t 학과\t 연락처\t 주소\t ");
		for(int i =0;i<list.size();i++) {
			StudentDTO dto = list.get(i);
			System.out.println((i+1)+"번째 학생의 "+dto.getHakbun()+"\t"+dto.getName()
			+"\t"+dto.getMajor()+"\t"+dto.getPhone()+"\t"+dto.getAddress());
		}
		sc.close();
	}

}
