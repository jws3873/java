package khie;

import java.util.Scanner;

// 별을 찍어보자.

public class Ex24 {

	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 최대 갯수를 입력하세요. >>> ");
		int star = sc.nextInt();
		
		while(i<=star) {
			System.out.print("*");
			i++;
		}
		
		sc.close();
	}
	

}
