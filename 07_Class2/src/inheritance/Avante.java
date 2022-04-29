package inheritance;

/*
 * 1.super 키워드
 * -부모의 멤버를 호출하는 명령어.
 * 형식) super.부모클래스 멤버(멤버변수, 멤버메서드)
 * 2.this키워드
 * -현재 클래스에 소속된 멤버를 호출하는 명령어.
 * -this 키워드는 현재 객체 자기자신을 의미함.
 * 형식) this.자식 클래스멤버(멤버변수, 멤버메서드)
 */

public class Avante extends Car2{
	//멤버변수
	String color = "흰색";
	
	void output() {
		System.out.println
		("엔진 : "+cc+", 문수 : "+door+",색상 : "+color);
		System.out.println
		("엔진 : "+cc+", 문수 : "+door+",색상 : "+super.color);
		System.out.println
		("엔진 : "+cc+", 문수 : "+door+",색상 : "+this.color);
	}
}
