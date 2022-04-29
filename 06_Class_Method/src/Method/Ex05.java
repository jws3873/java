package Method;

/*
   * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 *메서드 호출 방식 2가지
 *1. call by value 방식
 *-값을 전달하여 호출하는 방식. //인자를 매개변수 안에 할당한다?
 *-매개변수가 기본 자료형(int,double) 사용
 *
 *2. call by reference 방식
 *-java에서 많이 사용하는 방식(무지무지무지 중요함)
 *-주소값을 전달하여 호출하는 방식.
 *-매개변수가 참조자료형(배열, 클래스) 사용. 
   *  ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 */

public class Ex05 {
	public static void call(int x) {
		System.out.println("call() 메서드 호출....");
		
		x =100;
		System.out.println("num >>>>"+x);
	}
	public static void main(String[] args) {
		//1. call by value 방식
		int num = 200;
		
		System.out.println("메서드 호출 전.......");
		System.out.println("num >>>> "+num);
		call(num);
		System.out.println("메서드 호출 후.......");
		System.out.println("num >>>> "+num);
		
	}

}
