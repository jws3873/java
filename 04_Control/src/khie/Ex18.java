package khie;

import java.util.Scanner;

public class Ex18 {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오");
	String name =sc.next();
	
	System.out.print("국어점수를 입력하시오");
	int kor =sc.nextInt();
	
	System.out.print("영어점수를 입력하시오");
	int eng =sc.nextInt();		

	System.out.print("수학점수를 입력하시오");
		int math =sc.nextInt();
;
		System.out.print("자바점수를 입력하시오");
	int java =sc.nextInt();
	
	int total = kor+eng+math+java;
	double average = total/4.0;
	String grade;
	
	switch((int)(average/10)) {
	case 10: case 9: grade="A 학점"; break;
	case 8: grade="B 학점"; break;
	case 7: grade="C 학점"; break;
	case 6: grade="D 학점"; break;
	default: grade="F학점";
	}
	
	System.out.println("이름 : "+ name);
	System.out.println("국어점수 : "+ kor);
	System.out.println("영어점수 : "+ eng);
	System.out.println("수학점수 : "+ math);
	System.out.println("자바점수 : "+ java);
	System.out.println("총점 : "+ total);
	System.out.printf("평균 : %.2f\n", average);
	System.out.println("학점 : "+ grade);
	
	sc.close();
	}

}
