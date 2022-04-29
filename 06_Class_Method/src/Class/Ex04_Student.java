package Class;

public class Ex04_Student {

	public static void main(String[] args) {

		//기본 생성자로 객체를 생성
		Student s = new Student();
		s.display();
		System.out.println();
		
		s.hakbun = 20220011;
		s.name = "홍길동";
		s.major = "검술";
		s.addr = "경성";
		s.display();
		System.out.println();
		
		// 인자 생성자로 객체를 생성.
		Student s1 = new Student(2022002, "유관순", "회계학과", "충남 천안시");
		s1.display();
		System.out.println();
		
	}

}
