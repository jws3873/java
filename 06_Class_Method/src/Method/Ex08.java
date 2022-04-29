package Method;

import java.util.Scanner;

public class Ex08 {
	public static int total(int k,int e,int m) {
		return k+e+m;
	}
	public static double avg(int s) {
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
		//1. 키보드로 이름, 국어점수, 영어점수, 수학점수를 입력을 받자
		System.out.print("이름을 입력하세요:");
		String name = sc.next(); 
		
		System.out.print("국어점수 입력 :");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 입력 :");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 입력 :");
		int math = sc.nextInt();
		
		//2. 총점을 구하자. ==> 총점 메서드를 호출
		int sum = total(kor,eng,math);
		//3. 평균을 구하자. ==> 평균 메서드를 호출
		double average = avg(sum);
		//4. 학점을 구하자. ==> 학점 메서드를 호출
		String grd = grade(average);
		
		//5. 화면에 성적을 출력해 보자.
		System.out.println("이    름: "+name);
		System.out.println("국어 점수: "+kor+"점");
		System.out.println("영어 점수: "+eng+"점");
		System.out.println("수학 점수: "+math+"점");
		System.out.println("총       점: "+sum+"점");
		System.out.printf("평       균:%.2f점%n",average);
		System.out.println("학       점: "+grd);
		
		sc.close();
	}

}
