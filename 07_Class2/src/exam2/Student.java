package exam2;

public class Student {
	
	String studentName; //학생이름
	int tMoney; //교통카드(잔액)
	
	public Student() {
	}
	public Student(String studentName, int tMoney) {
		this.studentName = studentName;
		this.tMoney = tMoney;
	}// 인자생성자

	//버스를 타고 학원에 가는 경우
	void take(Bus2 bus) {
		bus.take(1200);
		this.tMoney -=1200;
		
	}
	//지하철을 타고 학원에 가는 경우
	void take(Subway2 subway) {
		subway.take(1250);
		this.tMoney -=1200;
	}
	
	//학생 정보 출력
	void showStudentInfo() {
		System.out.println(studentName+" 님의 카드 잔액은"+tMoney+" 원 입니다.");
	}
	
}
