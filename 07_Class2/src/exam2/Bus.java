package exam2;

public class Bus {
	// 멤버변수
	int busNumber; //버스번호
	int passengerCount; // 승객 수
	int money; //버스 회사의 수업
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승차 메서드
	void take(int money) {
		this.money += money; // 버스회사의 수업
		passengerCount++;
	}
	
	//버스회사 정보 출력
	void showBusInfo() {
		System.out.println("버스No. >>>"+busNumber);
		System.out.println("버스 승객 수 >>>"+passengerCount);
		System.out.println("버스 회사 수입 >>>"+money);
		System.out.println("::::::::::::::::::::::::::::::::::::");
	}

}
