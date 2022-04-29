package Exam07;
//Employee - 추상클래스
// 필드 : 이름
// 생성자, Getter()
// 메서드 : 급여계산 getPays() -> 추상메소드
public abstract class Employee {
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public abstract int getPays();
}
