package test2;

public class BuyCar {
	// Driver와 Benz관계에서 전체에 해당함
	// Driver 클래스와 집약관계(aggregation)
	// Benz 클래스와 합성관계(composition) 
	
	private Driver bestDriver;
	private Car car;
	
	//생성자
	public BuyCar(Driver d) {
		this.bestDriver = d; // 생성자에서 참조값을 인자로 받아 세팅
							 
		this.car = new Benz(); // 생성자에서 객체를 생성한다.
	}						   
}
