package khie;

import java.util.Scanner;

public class Exam02_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("** coffee 메뉴**");
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마키아또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		int coffeenumber = sc.nextInt();
		System.out.print("주문수량 >> ");
		int amount = sc.nextInt();
		System.out.print("입금액 >> ");
		int money = sc.nextInt();
		
		String coffeename = null;
		int coffeedanga= 0;
		switch(coffeenumber) {
		case 1: coffeename = "아메리카노";
				coffeedanga = 3000;
				break;
		case 2: coffeename = "카페라떼";
				coffeedanga = 4000;
				break;
		case 3: coffeename = "마키아또";
				coffeedanga = 4500;
				break;
		case 4: coffeename = "바닐라 라떼";
				coffeedanga = 4500;
				break;
		default :
		}
		int avg = (int)((coffeedanga*amount)*0.1);
		int total =(coffeedanga*amount)+avg;
		int charge = money-total;
		
		System.out.println("주문한 메뉴 : " + coffeename);
		System.out.println("커피 단가  : " + coffeedanga);
		System.out.println("주문수량 : " + amount);
		System.out.println("입금액 : " + money+"원");
		System.out.println("총금액 : " + total+"원");
		System.out.println("거스름돈 : " + charge+"원");
		
		sc.close();
	}

}
