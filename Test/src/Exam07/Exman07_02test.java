package Exam07;

import java.util.Scanner;

public class Exman07_02test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요.(1.원형, 2. 사각형) ");
		int shape = sc.nextInt();
		Shape2 s = null;
		if(shape==1) {
			System.out.print("반지름 입력 >>>");
			s = new Shape2(sc.nextInt());
			System.out.println("========================");
			System.out.printf("원의면적:%.1f\n",s.CircleArea());
		}
		else if(shape ==2) {
			System.out.print("가로 >>>");
			int row = sc.nextInt();
			System.out.print("가로 >>>");
			int column = sc.nextInt();
			s = new Shape2(row,column);
			System.out.println("========================");
			System.out.printf("사각형의면적:%.1f\n",s.RectangleArea());
		}
		
		System.out.println("고생하셨습니다.");
		sc.close();
	}

}
