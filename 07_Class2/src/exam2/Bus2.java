package exam2;

public class Bus2 extends PublicTransfer{
	int busNumber;
	public Bus2() {
		// TODO Auto-generated constructor stub
	}

	public Bus2(int busNumber) {
		super();
		this.busNumber = busNumber;
	}

	@Override
	void take(int money) {
		super.money += money;
		super.passengerCount++;
		
	}

	@Override
	void showCompanyInfo() {
		System.out.println("버스No. >>>"+busNumber);
		System.out.println("버스 승객 수 >>>"+passengerCount);
		System.out.println("버스 회사 수입 >>>"+money);
		System.out.println("::::::::::::::::::::::::::::::::::::");
		
	}
	
}
