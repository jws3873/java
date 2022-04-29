package abstracts;

public class Student extends Person {
	
	private String major;
	
	public Student() {}
	
	public Student(String name, String major) {
	super.name= name;
	this.major = major;
	}
	//상속받은 추상클래스의 추상메서드를 구현
	void output() {
		System.out.println(getName()+" 학생입니다.");
		System.out.println(major+" 과목을 수강중입니다.");
	}

}
