package Wrapper;

/*
 * wrapper class
 * -wrap : 감싸다, 포장하다.
 * -기본자료형을 클래스 타입으로 포장해 놓은 클래스.
 * -기본자료형보다 객체로 저장하기 때문에 더 다양한
 * 기능을 제공하기 위해서 사용함.
 * -기본 타입의 값을 내부에 두고 포장을 하기 때문에 포장(wrapper)
 * 클래스 라고 하기도 함.
 * -기본자료형: byte, short, long, float, double, boolean, char, int
 * -wrapper class: Byte, Short, Long, Floar, Double, Boolean, Character, Integer
 * 
 * 
 * -wrapper class 사용이유
 * 1. 매개변수로 객체가 요구 될때
 * 2. 기본형 값이 아닌 객체로 저장해야 할 때
 * 3. 객체간 비교가 필요할 때
 * 
 * ★★★★★★★★★★★★★★★★★★★
 * - wrapper class를 사용하는 데 더 중요한 이유 : 형변환이 자유롭다는 특징이 있음.
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		// 기본자료형들은 단순한 연산을 하기 위한 용도로 사용이 됨.
		int su1 = 150, su2 = 35;
		System.out.println("더하기 : "+(su1+su2));
		System.out.println();
		//클래스 자료형
		//박싱Boxing : 기본자료형의 데이터를 래퍼클래스형을으로 변환
		//언방식unBoxing : 클래스형 -> 기본자료형 
		Integer in1 = new Integer(su1); //박싱
		Integer in2 = new Integer(su2); //박싱
		
		//형변환이 자유로워짐.
		System.out.println("double형:"+in1.doubleValue());
		System.out.println();
		
		//숫자 -> 문자열
		//toString(): 숫자 -> 문자
		//String.valueOf(숫자) : 숫자 -> 문자열
		//숫자+"":숫자 -> 문자열
		
		System.out.println("숫자 -> 문자열 : "+(in2.toString()+34));
		System.out.println("숫자 -> 문자열 : "+(String.valueOf(in2)+34));
		System.out.println("숫자 -> 문자열 : "+(in2+34+""));
		
		//parseInt() : 문자열 ->숫자
		System.out.println("문자열 ->숫자"+Integer.parseInt(in2.toString()));
		
		
		
		Integer i = Integer.valueOf(10);
		System.out.println(i.getClass());
		
		Integer i2 = 10; // Integer.valuOf(10);
		System.out.println(i2.getClass());
		
		int i3 = Integer.parseInt("10");
		Integer i4 = Integer.valueOf(i3);
		System.out.println(i4.getClass());
		
		int i5 = i4.intValue();
		
		
		
		
	}
	
	

}
