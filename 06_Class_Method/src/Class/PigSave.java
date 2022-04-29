package Class;

//돼지 저금통

public class PigSave {
	static int balance; // 돼지 저금통 잔액
	
	public PigSave() {} //기본생성자
	
	public PigSave(int b) {
		balance = b;
	}// 인자생성자
	
	//입금을 하는 메서드
	public void deposit(int money) {
		System.out.println("돼지 저금통에 입금을 합니다........");
		balance += money;
		System.out.println("현재 잔액 >>>"+balance+" 원");
	}
	//출금을 하는 메서드
	public void withraw(int money) {
		if(balance<money) {
			System.out.println("돼지 저금통에 잔액이 부족합니다.....");
			return; // 현재 실행되고 있는 메서드를 종료시키는 명령어
		}
		
		System.out.println("돼지 저금통에 출금을 합니다........");
		balance -= money;
		System.out.println("현재 잔액 >>>"+balance+" 원");
		
	}
	
}
