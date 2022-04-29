package inheritance;

public class Student extends Human{
	//String name;
	//int age;
	//String job;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name,int age,String job, String major) {
		this.name=name;
		this.age=age;
		this.job=job;
		this.major=major;
	} //인자생성자
	String major; // 학과
	void studentInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("직업 : "+job);
		System.out.println("학과 : "+major);
	}
}
