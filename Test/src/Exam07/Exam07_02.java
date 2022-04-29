package Exam07;

import java.util.Scanner;

public class Exam07_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도형을 선택하세요.(1.원형, 2. 사각형) ");
		System.out.print("도형 선택 >>> ");
		int shape = sc.nextInt();
		if(shape == 1) {
			System.out.print("반지름 입력 >>> ");
			Circle circle = new Circle(sc.nextInt());
			System.out.println("==============================");
			System.out.printf("원의면적 : %.1f",circle.findArea());
		}
		else if(shape == 2) {
			System.out.print("가로 >>> ");
			int row=sc.nextInt();
			System.out.print("가로 >>> ");
			int column=sc.nextInt();
			Rectangle rectangle = new Rectangle(row,column);
			System.out.println("==============================");
			System.out.printf("사각형의 면적: %.1f",rectangle.findArea());
		}
		else {
			System.out.println("올바른 도형을 선택하세요.");
		}
		sc.close();
	}

}
