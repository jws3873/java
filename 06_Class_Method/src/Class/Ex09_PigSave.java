package Class;


public class Ex09_PigSave {

	public static void main(String[] args) {
		//돼지 저금통 객체 생성 
		PigSave p = new PigSave(0);
		p.deposit(3000);  //입금 메서드 호출
		p.deposit(10000); //입금 메서드 호출
		p.deposit(10000); //입금 메서드 호출
		p.withraw(15000); //출금 메서드 호출
		p.withraw(10000); //출금 메서드 호출
		
//		p.balance =10000;
	}

}
