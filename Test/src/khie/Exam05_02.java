package khie;

import java.util.Scanner;

public class Exam05_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 가로, 세로를 입력하세요.");
		int row = sc.nextInt();
		int column = sc.nextInt();
		Rectangle r = new Rectangle(row, column); 
		System.out.println("===========================");
		System.out.println("사각형의 넓이 : "+r.width());
		System.out.println("사각형의 둘레 : "+r.circumference());
		sc.close();
	}

}
