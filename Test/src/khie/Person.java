package khie;

public class Person {
	String name;
	String gender;
	int age;
public Person() {}

public Person(String n,String g,int a){
	name = n;
	gender = g;
	age = a;
	}
public void display() {
	System.out.println("=========================");
	System.out.println("이름 : "+name);
	if(gender.equals("male")) {
		System.out.println("성별 : 남자");
	}else if(gender.equals("female")) {
		System.out.println("성별 : 여자");
	}else {
		System.out.println("성별을 (male 또는 female로 입력하시오)");
	}
	
	System.out.println("나이 : "+age+"세");
}
}
