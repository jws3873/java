package khie;

import java.util.Scanner;

public class Exam_06_01 {
	static final double  VAT_RATE = 1.1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 개수를 입력하시오. : ");
		Receipts[] receipts = new Receipts[sc.nextInt()]; 
		
		for(int i = 0;i<receipts.length;i++) {
			System.out.print((i+1)+"번째 메뉴의 품명, 단가, 수량을 입력하시오 : ");
			receipts[i] = new Receipts(sc.next(), sc.nextInt(), sc.nextInt());
		}
		System.out.println("------------------------------------");
		System.out.println("품명\t단가\t수량\t금액");
		System.out.println("------------------------------------");
		for(int i =0;i<receipts.length;i++) {
			System.out.printf("%s\t%,d\t %d\t%,d원\n",receipts[i].foodname,receipts[i].danga
					,receipts[i].ammount,(receipts[i].danga*receipts[i].ammount));
		}
		int totalPrice  = 0;
		int supplyPrice;
		int VAT;
		for(int i =0;i<receipts.length;i++) {
			totalPrice +=(receipts[i].danga*receipts[i].ammount);
		}
		supplyPrice = (int)(totalPrice/VAT_RATE);
		VAT = totalPrice-supplyPrice;
		System.out.println("------------------------------------");
		System.out.printf("공급가액\t\t\t%,d원\n",supplyPrice);
		System.out.printf("부가세\t\t\t%,d원\n",VAT);
		System.out.println("------------------------------------");
		System.out.printf("청구금액\t\t\t%,d원\n",supplyPrice+VAT);
		sc.close();
	}

}
