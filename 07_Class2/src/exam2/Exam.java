package exam2;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student1 = new Student("홍길동",50000);
		Student student2 = new Student("정원석",50000);
		Bus2 bus = new Bus2(100);
		Subway2 subwayGreen = new Subway2(2);


		student1.take(bus);
		student2.take(subwayGreen);
		
		//학생 1에 대한 정보를 출력
		student1.showStudentInfo();
		System.out.println();
		
		//학생 2에 대한 정보를 출력
		student2.showStudentInfo();
		System.out.println();
		
		//버스와 지하철에 대한 정보를 출력
		bus.showCompanyInfo();
		System.out.println();
		subwayGreen.showCompanyInfo();
		System.out.println();
		
		sc.close();
		
	}

}
