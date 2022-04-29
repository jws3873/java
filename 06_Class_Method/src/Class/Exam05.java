package Class;

import java.util.Scanner;

public class Exam05 {
	public static final double TAX_TATE = 1.1; //static 상수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴는 몇개인가요?");
		Receipt[] receipts = new Receipt[sc.nextInt()];
		//메뉴와 단가, 수량을 키보드로 입력을 받아서 객체 배열에 저장을 하자.
		for(int i =0;i<receipts.length;i++) {
			System.out.print((i+1)+"번째 메뉴의 품명 단가 수향을 입력하시오:");
			receipts[i] = new Receipt(sc.next(),sc.nextInt(),sc.nextInt());
		}
		int totalPrice=0;
		System.out.println("---------------------------------");
		System.out.println("품명\t단가\t수량\t금액");
		System.out.println("---------------------------------");
		
		for(int i =0;i<receipts.length;i++) {
			System.out.printf("%s\t%,d\t%,d\t%,d원\n",receipts[i].name,receipts[i].unitPrice
					,receipts[i].amount,(receipts[i].unitPrice*receipts[i].amount));
			totalPrice +=(receipts[i].unitPrice*receipts[i].amount);
		}
		
		int supplyPrice = (int)(totalPrice/TAX_TATE);
		
		int vat =totalPrice-supplyPrice;
		System.out.println("---------------------------------");
		System.out.printf("공급가액\t\t\t%,d원\n",supplyPrice);
		System.out.printf("부가세\t\t\t%,d원\n",vat);
		System.out.println("---------------------------------");
		System.out.printf("청구금액\t\t\t%,d원\n",supplyPrice+vat);
		
		sc.close();

		
		
		
	}

}
