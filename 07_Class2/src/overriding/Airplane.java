package overriding;

public class Airplane extends Flyer{
	void takeOff() {
		System.out.println("비행기가 땅에서 하늘로 이륙한다.");
	}
	
	void fly() {
		System.out.println("비행기가 하늘을 날아다닌다.");
	}
	
	void land() {
		System.out.println("비행기가 하늘에서 땅으로 착륙한다.");
	}
}
