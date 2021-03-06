package khie;

import java.util.Scanner;

public class Exam04_01 {
	static Scanner sc1 = new Scanner(System.in);
	static int studentNumber=0;
	static String[] name;
	static int[] hakbun;
	static String[] major;
	static String[] phoneNumber;

	static void studentEnrollment() {
		System.out.print("학생 수를 입력하세요. : ");
		studentNumber = sc1.nextInt();
		name = new String[studentNumber];
		hakbun = new int[studentNumber];
		major = new String[studentNumber];
		phoneNumber =new String[studentNumber];

		for(int i =0;i<studentNumber;i++) {
			System.out.print((i+1)+"번째 학생의 이름을 입력하시오 : ");
			name[i] = sc1.next();
			System.out.print((i+1)+"번째 학생의 학번을 입력하시오 : ");
			hakbun[i] = sc1.nextInt();
			System.out.print((i+1)+"번째 학생의 학과를 입력하시오 : ");
			major[i] = sc1.next();
			System.out.print((i+1)+"번째 학생의 전화번호를 입력하시오 : ");
			phoneNumber[i] = sc1.next();
		}
		System.out.println();
	}
	static void studentPrint() {
		System.out.println();
		System.out.println("*********학생정보 출력**********");
		if(studentNumber == 0) {
		System.out.println();	
		System.out.println("***학생 정보를 먼저 입력해 주세요.***");
		System.out.println();
		}else {
		for(int i =0;i<name.length;i++) {
		System.out.println();
		System.out.println((i+1)+"번째 학생의 정보");
		System.out.print("이름 : "+name[i]+"\t");
		System.out.print("학번 : "+hakbun[i]+"\t");
		System.out.print("학과 : "+major[i]+"\t");
		System.out.print("전화번호 : "+phoneNumber[i]+"\t\n");
		System.out.println();
			}
		}
		System.out.println("*****************************");
		System.out.println();
	}
	
	static void studentserch(int x) {
		int sum = 0;
		System.out.println();
		for(int i =0;i<name.length;i++) {
			if(x==hakbun[i]) {
				System.out.println();
				System.out.println("*****************************");
				System.out.println("**"+hakbun[i]+"학번 학생의 정보 출력**");
				System.out.println("이름 : "+name[i]);
				System.out.println("학번 : "+hakbun[i]);
				System.out.println("학과 : "+major[i]);
				System.out.println("전화번호 : "+phoneNumber[i]);
				break;
			}
			sum++;
			if(sum==name.length) {
				System.out.println("학생의 정보가 없다.");
			}
		}
		System.out.println();
	}
	
	static void studentCorrection(int x){
		int sum = 0;
		System.out.println();
		for(int i =0;i<name.length;i++) {
			if(x==hakbun[i]) {
				System.out.println(hakbun[i]+"학번 학생의 정보수정");
				System.out.print("학생의 수정할 학과를 입력하시오 : ");
				major[i] = sc1.next();
				System.out.print("학생의 수정할 전화번호를 입력하시오 : ");
				phoneNumber[i] = sc1.next();
				break;
			}
			sum++;
			if(sum==name.length) {
				System.out.println("학생의 정보가 없다.");
			}
		}
		System.out.println();
	}
	static boolean programOff(String s) {
		if(s.equals("y")) {
			return  false;
		} else {return true;}
	}
	
	public static void main(String[] args) {
		boolean program=true;
		while(program) {
		System.out.println("********학생관리 프로그램*********");
		System.out.println("1. 학생등록");
		System.out.println("2. 등록학생 전체출력");
		System.out.println("3. 학생조회");
		System.out.println("4. 정보수정");
		System.out.println("5. 프로그램 종료");
		System.out.printf("원하시는 메뉴를 선택해 주세요 : ");
		int menuSelect=sc1.nextInt();
		if(menuSelect==1) {studentEnrollment();}
		else if(menuSelect ==2) {studentPrint();}
		else if(menuSelect ==3){
			System.out.print("학번을 입력하시오 : ");
			studentserch(sc1.nextInt());
			}
		else if(menuSelect ==4){
			System.out.print("수정할 학생의 학번을 입력하시오 : ");
			studentCorrection(sc1.nextInt());
			}
		else if(menuSelect ==5){
			System.out.print("프로그램을 종료하시겠습니다?(y/n)");
			program = programOff(sc1.next());
			}
		}
		System.out.print("프로그램이 종료되었습니다.");
		sc1.close();
		
	}	
}

