package khie;

import java.util.Scanner;

/*
 *  내가 여행가고 싶은 5개나라를
 *  키보드로 입력을 받아서 배열에 저장해 보자.
 */

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nations =new String[5];
		
//		System.out.println("첫번째 나라 입력 >>> ");
//		nations[0] = sc.next();
//		
//		System.out.println("두번째 나라 입력 >>> ");
//		nations[1] = sc.next();
//		
//		System.out.println("세번째 나라 입력 >>> ");
//		nations[2] = sc.next();
//		
//		System.out.println("네번째 나라 입력 >>> ");
//		nations[3] = sc.next();
//		
//		System.out.println("다섯번째 나라 입력 >>> ");
//		nations[4] = sc.next();
		
		//반복문을 이용하여 5개나라 입력하시
		for(int i = 0;i<nations.length;i++) {
			System.out.printf("%d번째 나라 입력 >>> ",i+1);
			nations[i] = sc.next();
		}
		
		//배열에 저자된 5개 나라는 반복문을 이용하여 화면에 출력해 보기
		for(int i = 0;i<nations.length;i++) {
			System.out.printf("%d번째 나라 : %s%n",i+1,nations[i]);
		}
		
		sc.close();
	}

}
