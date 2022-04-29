package abstracts;

public class Ex02_Person {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "java");
		Professor professor = new Professor("이순신", "해양학과");
		
		student.output();
		
		System.out.println();
		
		professor.output();
		
	}

}
