package singleton;

import java.time.Instant;

/*
 * 싱글턴 방식(singleton)?
 * -생성자를 private 접근지정자를 이용하여 
 * 외부에서 직접 접근을 못하게 불허하는 방식
 * -외부에서 해당 인스턴스를 new로 생성하지 못하도록 하는 방식.
 * -사용하는 이유 : 매번 객체를 생성하게 되면 메모리의 성능이 느려지는 단점이 발생하기 때문임.
 */
public class Company {
	
//	private static Company instance = null;
//	
//	private Company() { // 다른클래스에서 해당클래스로 객체 생성을 진행할 수 없다.
//		// TODO Auto-generated constructor stub
//	}
//	
//	public static Company getInstance() { //반환타입이 컴패니 클래스 타입
//		if(instance == null) {
//			instance = new Company();
//		} // 최초에 생성하는 개체 이후의 객체는 기존의 instance 참조변수에 생성된 객체주소가 저장된다.
//		return instance;
//	}
	private static Company instance = null;
	private Company() {
		// TODO Auto-generated constructor stub
	}
	public static Company getInstance() {
		if(instance==null) return new Company();
		return instance;
	}
	
}
