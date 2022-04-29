package khie;

public class Ex02 {

	public static void main(String[] args) {
/*
 * 연결된 예외 Exception예외는 checked이기 때문에 컴파일 되지 않는다.
 * 하지만 연결된 예외를 통해 새로운 RuntimeException예외를 발생시켜 initCause()메서드를 통해 메서드 안에 원인예외를 넣어주면
 * RuntimeException안에 원인 예외인 Exception가 있기 때문에 컴파일에 문제가 되지 않는다.
 * 이러한 방법을 통해 여러가지 예외를 하나의 예외로 묶어서 다룰 수 있다. <--잘 이해 못함. ㅜㅜ
 */	
		try {
			throw new Exception("나는 Exception");
		}catch(Exception e) {
			
			RuntimeException re = new RuntimeException("나는 RuntimeException");
			re.initCause(e);
			throw re;
		}
	
 		
		
	}

}
