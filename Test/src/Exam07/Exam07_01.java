package Exam07;

import java.util.Scanner;

public class Exam07_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태-정규직<P>, 임시적<T>를 입력하세요");
		String pt = sc.next();
		String position = "";
		Employee e=null;
		if(pt.equalsIgnoreCase("p")){
			System.out.println("이름, 기본급, 보너스를 입력하세요.");
			e= new Permanent(sc.next(),sc.nextInt(),sc.nextInt());
			position = "정규직";
		}
		else if(pt.equalsIgnoreCase("t")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			e = new Temporary(sc.next(),sc.nextInt(),sc.nextInt());
			position = "임시직";
		}
		System.out.println("======================================");
		System.out.println("고용형태 : "+position);
		System.out.println("이름 : "+e.getName());
		System.out.printf("급여 : %,d원",e.getPays());
		sc.close();
	}

}

