package exam2;

public class Subway2 extends PublicTransfer{
	int lineNumber;
	public Subway2() {
		// TODO Auto-generated constructor stub
	}

	public Subway2(int lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}

	@Override
	void take(int money) {
		super.money += money;
		super.passengerCount++;
		
	}

	@Override
	void showCompanyInfo() {
		System.out.println("지하철 노선No. >>>"+lineNumber);
		System.out.println("지하철 승객 수 >>>"+passengerCount);
		System.out.println("지하철 회사 수입 >>>"+money);
		System.out.println("::::::::::::::::::::::::::::::::::::");
		
	}
	
}
