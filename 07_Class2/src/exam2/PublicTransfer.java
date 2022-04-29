package exam2;

public abstract class PublicTransfer {

	int passengerCount; // 승객 수
	int money; //회사의 수입
	
	abstract void take(int money);
	abstract void showCompanyInfo();
}
