package khie;

import java.util.Scanner;

/*
 * [문제] 이름과 국어점수, 영어, 자바점수를
 * 		키보드로 입력을 받아서 성적을 처리해 보자.
 * 		총점, 평균까지 출력해 보자.
 */
public class Ex13 {

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
		
		System.out.println("이름 : "+ name);
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ math);
		System.out.println("자바점수 : "+ java);
		System.out.println("총점 : "+ total);
		System.out.printf("평균 : %.2f\n", average);
		
		if(average>=90)System.out.println("A학점입니다.");
		else if(average>=80)System.out.println("B학점입니다.");
		else if(average>=70)System.out.println("C학점입니다.");
		else if(average>=60)System.out.println("D학점입니다.");
		else System.out.println("D학점입니다.");
		sc.close();


	}

}
