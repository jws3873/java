package abstracts;

public class Professor extends Person{
	
	private String major;
	
	public Professor() {}
	
	public Professor(String name, String major) {
	super.name= name;
	this.major = major;
	}
	
	//상속받은 추상클래스의 추상메서드를 구현
	void output() {
		System.out.println(getName()+" 교수입니다.");
		System.out.println(major+" 를 전공합니다.");
	}

}
