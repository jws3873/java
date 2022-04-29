package khie;

import java.util.Scanner;

public class Exam02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("지방의 그램을 입력하세요 : ");
		int fat = sc.nextInt();
		System.out.print("탄수화물의 그램을 입력하세요 : ");
		int carbohydrate = sc.nextInt();
		System.out.print("단백질의 그램을 입력하세요 : ");
		int protein = sc.nextInt();
		
		int calorie = (fat*9)+(protein*4)+(carbohydrate*4);
		System.out.println("총칼로리 : "+calorie+" cal");
		sc.close();
	}

}
