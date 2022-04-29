package khie;

import java.util.Scanner;

public class Exam05_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
		String name=sc.next();
		int time=sc.nextInt();
		int timePay=sc.nextInt();
		Temporary t = new Temporary(name, time, timePay);
		t.salaryCalculation();
		sc.close();
	}

}
