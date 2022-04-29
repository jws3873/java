package test2;

public class Benz extends Car{
	// Car 클래스의 Generalication(일반화)
	// 관계이며 자식 클래스에 해당한다.
	
	
	private static int price;
	
	//Status 클래스와 dependency의존 관계 이며 한클래스가 다른클래스를 사용하는 경우
	public Status autoDrive() {
		return new Status();
		
	}
	
	// Car 클래스의 추상메서드를 구현
	@Override
	protected void sprecialFunction() {}

}
