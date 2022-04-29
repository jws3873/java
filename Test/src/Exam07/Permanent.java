package Exam07;
//ermanent - 정규직
// 필드 : 기본급(salary), 보너스(bonus)
// 생성자, Getter()
// 메서드 : 급여계산 getPays() 오버라이딩 -> salary + bonus
public class Permanent extends Employee{
	private int salary;
	private int bonus;
	public Permanent() {
		// TODO Auto-generated constructor stub
	}
	public Permanent(String name,int salary,int bonus) {
//		super.setName(name);
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	@Override
	public int getPays() {
		return salary + bonus;
	}

}
