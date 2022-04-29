package Method;

import java.util.Scanner;

public class Exam {
	public static void input(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
		for(int i =0;i<n.length;i++) {
			System.out.print((i+1)+"번째 학생의 이름을 입력하시오 : ");
			n[i] = sc.next();
			System.out.print((i+1)+"번째 학생의 학번을 입력하시오 : ");
			h[i] = sc.nextInt();
			System.out.print((i+1)+"번째 학생의 학과를 입력하시오 : ");
			m[i] = sc.next();
			System.out.print((i+1)+"번째 학생의 전화번호를 입력하시오 : ");
			p[i] = sc.next();
		}
		System.out.println("학생정보가 입력 완료되었습니다.");
	}
	
	//학생의 정보를 출력하는 메서드
	public static void output(String[]n, int[] h, String[] m, String[] p) {
		for(int i = 0;i<h.length;i++) {
			System.out.println("***"+(i+1)+"번째 학생 정보 출력***");
			System.out.println("학생의 이름: "+n[i]);
			System.out.println("학생의 학번: "+h[i]);
			System.out.println("학생의 학과: "+m[i]);
			System.out.println("학생의 연락처: "+p[i]);
			System.out.println(":::::::::::::::::::::::::::::::::");
		}
	}
	

	
	//학생 정보를 조회하는 메서드 호출
	public static void serch(String[]n, int[] h, String[] m, String[] p,Scanner sc) {
		System.out.println("조회할 학생의 학번을 입력하세요:");
		int hakbun = sc.nextInt();
		for(int i = 0;i<n.length;i++) {
			if(hakbun == h[i]) {
				System.out.println("학생의 이름: "+n[i]);
				System.out.println("학생의 학번: "+h[i]);
				System.out.println("학생의 학과: "+m[i]);
				System.out.println("학생의 연락처: "+p[i]);
			}
		}
	}
	//학생의 정보를 수정하는 메서드
	public static void update(int[] h, String[] m, String[] p, Scanner sc) {
		
		System.out.print("수정할 학생의 학번을 입력하세요. : ");
		int hakbun = sc.nextInt();
		
		for(int i =0;i<m.length;i++) {
			if(hakbun == h[i]) {
				System.out.print("수정할 학생 학과 입력 :");
				m[i] = sc.next();
				
				System.out.print("수정할 학생 연락처 입력 :");
				p[i] = sc.next();
			}
		}
		
	}
	public static String end(Scanner sc) {
		
		System.out.print("프로그램을 종료하시겠습니까?(y/n)");
		String end = sc.next();
		sc.close();
		return end;
		
		//시스템을 종료시키는 메서드
	}
	public static void main(String[] args) {
		//학생 정보를 저장하는 메서드

		Scanner sc = new Scanner(System.in);
		
		//1. 키보드로 학생 수를 입력을 받자.
		
		System.out.print("학생 수를 입력하세요.>>>");
		
		//2. 학생 정보 배열에 입력받은 학생 수 만큼의 배열을 생성하자.
		
		String[] names = new String[sc.nextInt()];
		int[] hakbuns = new int[names.length];
		String[] majors = new String[hakbuns.length];
		String[] phones = new String[majors.length];

		//		3. 무한 반복을 통해서 메뉴를 만들고 메서드를 호출하게 하자.
		while(true) {
			System.out.println("********학생관리 프로그램*********");
			System.out.println("1. 학생등록");
			System.out.println("2. 등록학생 전체출력");
			System.out.println("3. 학생조회");
			System.out.println("4. 정보수정");
			System.out.println("5. 프로그램 종료");
			System.out.println();
			
			System.out.printf("학생관리 메뉴 중 선택해 주세요 : ");
			
			int menu = sc.nextInt();
			String end="";
			switch(menu) {
			//학생을 등록하는 메서드 
			case 1: input(names, hakbuns, majors, phones, sc); 
					break;
					
					//등록 학생 전체 출력 메서드 호출
			case 2: output(names, hakbuns,majors,phones);
					break;
					
					//학생을 조회하는 메서드 호출
			case 3: serch(names, hakbuns, majors, phones, sc);
					break;
					
					//학생의 정보를 수정하는 메서드 호출
			case 4: update(hakbuns, majors, phones, sc);
					break;
					
					//프로그램 종료 메서드 호출
			case 5: end = end(sc);
					break;
			
			}// switch case문 end
			if(end.equals("Y")) {
				break;
			}
		}//while 반복문 end
		
	}
}
