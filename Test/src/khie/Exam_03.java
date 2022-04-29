package khie;

public class Exam_03 {

	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		int danga = Integer.parseInt(args[1]);
		int amount = Integer.parseInt(args[2]);
		
		System.out.printf("지불한 금액 : %d원 %n",money);
		System.out.printf("제품단가 : %d원 %n",danga);
		System.out.printf("수량 : %d%n",amount);
		
		int avg = (int)((danga*amount)*0.1);
		System.out.printf("부가세 : %d%n",avg);
		
		int total =(danga*amount)+avg;
		System.out.printf("상품총액 : %d원%n",total);
		
		int charge = money-total;
		System.out.printf("거스름 돈 : %d원%n",charge);
	}

}
