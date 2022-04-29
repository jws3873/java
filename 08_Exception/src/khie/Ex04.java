package khie;

/*
 * 예외처리
 * - 실행 시간에서 발생한 예외(오류) 를
 * 프로그램으로 처리한다는 의미.
 * 
 * -관련 키워드
 * 1. try~catch ~ finally 블럭
 * 2. throws 키워드
 * 
 * 1. try~catch ~ finally 블럭
 * 형식) try{ 예외가 발생할 가능성이 있는 코드}
 * catch(예외클래스 참조변수){
 * 예외가 발생한 경우 실행되는 코드;
 * 참조변수 : 예외에 관련된 정보를 넘겨 받는 변수.
 * }finally{ 생략도 가능함. 예외와 관련없이 처리 후에 실행되어야 하는 코드;}
 */

public class Ex04 {
	
	public static void main(String[] args)  {
		System.out.println("프로그램 시작");
		int num1 = 10,num2 = 0;
		int result = 0;
		try {
			result = num1/num2; // 에러발생구간 0으로 나눈 구간
		
		
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("에외정보 >>> "+ae);
		}
		System.out.println("result >>>"+result);
		
		System.out.println("프로그램 종료");

	}
	
}
