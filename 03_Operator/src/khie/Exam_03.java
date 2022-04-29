package khie;

/*
 * [문제] 키보드로부터 상품명과 해당 상품의 단가, 수량, 입금액을
 * 입력을 받아서 상품금액 (단가 * 수량)과 부가세액(상품금액의10%),
 * 상품총액(상품금액+부가세액)과 잔액을 구하여 화면에 출력해보자
 */

public class Exam_03 {

	public static void main(String[] args) {
		// 1-1. 키보드로부터 상품명을 입력을 받자.
		String product = args[0];
		
		// 1-2. 키보드로부터 해당 상품의 단가를 입력을 받자.
		int price = Integer.parseInt(args[1]);

		// 1-3. 키보드로부터 해당 상품의 수량을 입력을 받자.
		int quantity  = Integer.parseInt(args[2]);
		
		// 1-4 키보드로부터 입금액을 입력을 받자.
		int receivedmoney = Integer.parseInt(args[3]);
		
		//2. 상품의 금액(단가*수량) 을 계산해 보자.
		int sum = price * quantity;
		
		//3. 상품 금액의 부가세액을 계산해 보자.
		//공식) 상품금액의 *0.1
		int vat = (int)(sum*0.1);
		
		//4. 상품의 총금액을 계산해 보자.
		//공식)
		int totalprice = sum+vat;
		
		//5. 잔액을 계산해 보자.
		//공식) 입금액 - 상품의 총금액(상품금액 +부가세액)
		int change = receivedmoney - totalprice;
		
		//6. 화면에 해당 내역을 출력해 보자.
		System.out.println("상품명: "+ product);
		System.out.printf("상품단가: %,d원 %n", price);
		System.out.printf("입금액: %,d원 %n",receivedmoney);
		System.out.printf("상품의 금액: %,d원 %n", sum);
		System.out.printf("상품의 부가세: %,d원 %n", vat);
		System.out.printf("상품의 총금액: %,d원 %n", totalprice);
		System.out.printf("잔액: %,d원 %n", change);


	}

}
