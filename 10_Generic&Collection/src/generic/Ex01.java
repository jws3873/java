package generic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 제네릭(generic)?
 * -포괄적인, 총괄적인.
 * -특정한 클래스에 원하는 개체 타입을 지정하여
 * 지정된 객체만 저장하게 하는 자바 문법.
 * -다양한 타입의 객체들을 다루는 메서드나 다음에 학습할 
 * 컬렉션에서 컴파일할 대 타입을 확인해 주는 기능.
 * ==> 즉, 다루어질 객체의 타입을 미리 명시해 줌으로써
 * 번거로운 형변환을 줄여 준다는 장법이 있음.
 * 또한 객체의 타입을 컴파일 시에 체크하여 주기 땨문에
 * 객체의 타입 안정성을 높여주는 장점도 있음.
 * -여기서 타입의 안정성을 높여준다는 것은 의도하지 않은 타입의
 * 객체가 저장되는 것을 막고, 저장된 객체를 꺼내올 때 원해의
 * 타입과 다른 타입으로 잘못 형변환되어 발생할 수 있는 오류를
 * 줄여 준다느 것임.
 * -jdk 1.5 에서부터 추가된 기능.
 * -클래스 내부에서 사용할 데이터를 외부에서 지정하는 방법.
 * -데이터의 명확성과 안정성을 보장해 줌.
 * ==> 다른 데이터 타입의 데이터가 들어올 경우 컴파일 시점에서
 * error 발생.
 */
class Box{
	private Object obj; //Object 자료형은 모든 자료형이 같은 형을 사용할 수 있다.

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Box2{
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.setObj("지네릭"); // Box인스턴스의 obj는 String 자료형이 된다.
		
		System.out.println(box.getObj() instanceof String );
		
		String str = (String)box.getObj();
		
		
		System.out.println(str);
		
	

		
	}

}
