package khie;

/*
 * 에러(error)
 * -하드웨어의 오동작 또는 고장으로 인한 오류.
 * - 에러가 발생하면 프로그램 종료.
 * - 정상 실행 상태로 돌아갈 수 없음.
 * OutOfMemory, StrackOverFlow
 * 
 * 예외(exception)
 * -사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류.
 * -예외가 발생하면 프로그램 종료.
 * -예외 처리를 추가해 주면 정상 실행 상태로 돌아갈 수 있음.
 * -프로그램을 위한 보험처리. 위험한 상황에서 다른 코드를 보호하는 장치.
 * 
 * 예외의 종류
 * 1. 일반(컴파일)예외, checked, Exception과 그 자손
 * 2. 실행 예외 unchecked, RuntimeException과 그 자손
 * -예외 처리 코드를 생략하더라도 컴파일이 되는 예외.
 * 즉, 컴파일 하는 과정에서 예외 처리 코드를 검사하지 않는 예외를 말함.
 * -경험에 따라 예외코드를 작성할 필요가 없음.
 * 
 * 예외처리의 목적
 * -프로그램을 실행시 발생할 수 있는 상황들을 미리 정해 놓고 , 예외가 
 * 발생했을 경우에 대비하는 코드를 작성하여 프로그램이 정상적으로 작동하도록 하기 위함.
 * 정의 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것 -
 * 목적 프로그램의 비정상 종료를 막고 정상적인 실행상태를 유지하는 것 
 * 
 */

public class Ex01 {
	static void method1() {
		try {
			throw new Exception("예외3");
		}catch(Exception e) {
			System.out.println("예외 3발생:메서드1 예외에서 처리");
		}
	}
	static void method2() throws RuntimeException{

		throw new RuntimeException("예외4");
	
	}
	public static void main(String[] args) {

		try {
			throw new Exception("예외1");
		}catch(Exception e) {
			System.out.println("예외 1발생");
		}
		
		try {
			MyException me = new MyException("예외발생");
			throw me;
			
		}catch(Exception e) {
			System.out.println("예외 2발생");
		}
		method1();
		try {
			method2();
		}catch(RuntimeException e) {
			System.out.println("예외 4발생:메서드2 에서 메인으로 가져와서 처리");
		}
		
	}

}
