package Exam07;
//Temporary - 임시직
// 필드 : 작업시간(time), 시간당 급여(pay)
// 생성자, Getter()
// 메서드 : 급여계산 getPays() 오버라이딩 -> time * pay
public class Temporary extends Employee{
	private int time;
	private int pay;
	public Temporary() {
		// TODO Auto-generated constructor stub
	}
	public Temporary(String name,int time, int pay) {
	super(name);
	this.time = time;
	this.pay = pay;
	}
	@Override
	public int getPays() {
		return time * pay;
	}
	

}
