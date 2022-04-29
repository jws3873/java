package Method;

import java.util.Scanner;

//개인별 성적 처리-무한반복
//
public class Ex11 {
	//2과목의 총점을 구하는 메서드
		public static int total(int k,int e,int m) {
			return k+e+m;
		}
		public static double average(int s) {
			return s/3.0;
		}

		public static String grade(double a) {
			String grade ="";
			if(a>=90) grade = "A학점";
			else if(a>=80) grade = "B학점";
			else if(a>=70) grade = "C학점";
			else if(a>=60) grade = "D학점";
			else grade = "F학점";
			return grade;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//for문 무한반복: for(;;){}
		while(true) {
		System.out.print("이름 입력 >>> ");
		String name = sc.next();
		
		System.out.print("국어 점수 입력 >>> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 >>> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 >>> ");
		int math = sc.nextInt();

		System.out.println();
		
		int sum = total(kor,eng,math);
		double avg = average(sum);
		String grd = grade(avg);
		
		System.out.println("이    름: "+name);
		System.out.println("국어 점수: "+kor+"점");
		System.out.println("영어 점수: "+eng+"점");
		System.out.println("수학 점수: "+math+"점");
		System.out.println("총       점: "+sum+"점");
		System.out.printf("평       균:%.2f점%n",avg);
		System.out.println("학       점: "+grd);
		System.out.println("::::::::::::::::::::::::::::::::");
		System.out.println();
		
		System.out.print("계속하시겠습니까? (Y:계속/N:종료)");
		String loop = sc.next();
		
		if(loop.equalsIgnoreCase("N")) {
			break;
			}
		}
		System.out.println("수고 많이 하셨습니다.");
		sc.close();	
	}

}
