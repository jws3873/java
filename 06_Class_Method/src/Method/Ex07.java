package Method;

// 메서드 호출시 반환형
//

public class Ex07 {
	
	//반환되는 값이 일반 숫자(리터럴) 이 반환이 되는 경우
	public static int method1() {
		//반환형을 통해 메서드 호출한 곳으로 값을 전달해야 할 경우 void를 작성하지 않는다.
		// void대신 반환할 자료형을 기입한다 int, double, String 등
		return 155; // 반환형 자료형을 지정할 시 return 값을 반드시 기입하여야 한다.
	}
	//반환되는 값이 변수가 반환이 되는 경우
	public static int method2(int x,int y) {
		int sum = (x*2)+(y*2);
		return sum; 
	}
	//반환되는 값이 수식이 반환되는 경우
	public static int method3(int x,int y) {
		return x+y; 
	}
	
	//반환되는 값이 문자열이 반환이 되는 경우
	public static String method4() {
		return "홍길동";
	}
	
	//반환되는 값이 문자열 변수가 반환이 되는 경우
	public static String method5(String x, String y) {
		String result =  x+y;
		return result;
	}
	
	//반환되는 값이 문자열 결합(+) 수식이 반환이 되는 경우
	public static String method6(String x, String y) {
		return x+y;
	}
	
	public static void main(String[] args) {

		//int su = method1(); //su라는 기본형 변수에 메서드에서 반환된 return 값이 저장된다 이때 반환값과 변수의 타입이 일치하여야 한다.
		System.out.println
		("method1() 메서드 호출 후 반환 값 >>> "+method1());
		
		System.out.println
		("method2() 메서드 호출 후 반환값 >>> "+method2(145,200));
		
		System.out.println
		("method3() 메서드 호출 후 반환값 >>> "+method3(145,200));
		
		System.out.println
		("method4() 메서드 호출 후 반환값 >>> "+method4());
		
		System.out.println
		("method5() 메서드 호출 후 반환값 >>> "+method5("대한","민국"));
		
		System.out.println
		("method6() 메서드 호출 후 반환값 >>> "+method6("이","순신"));
		
	}

}
