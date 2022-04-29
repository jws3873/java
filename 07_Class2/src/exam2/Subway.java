package exam2;

public class Subway {
	// 멤버변수
	int lineNumber; //지하철 노선(호선)
	int passengerCount; // 승객 수
	int money; //지하철 회사의 수업
	public Subway() {
		// TODO Auto-generated constructor stub
	}
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//승차 메서드
	void take(int money) {
		this.money += money; // 지하철회사의 수업
		passengerCount++;
	}
	
	//버스회사 정보 출력
	void showSubwayInfo() {
		System.out.println("지하철 노선 No. >>>"+lineNumber);
		System.out.println("지하철 승객 수 >>>"+passengerCount);
		System.out.println("지하철 회사 수입 >>>"+money);
		System.out.println("::::::::::::::::::::::::::::::::::::");
	}
}
