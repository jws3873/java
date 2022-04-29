package overriding;

public class Bird extends Flyer{
	void takeOff() {
		System.out.println("새가 땅에서 하늘로 오르기 위해 날개를 펴다.");
	}
	
	void fly() {
		System.out.println("새가 하늘을 날아다닌다.");
	}
	
	void land() {
		System.out.println("새가 하늘에서 땅으로 내려온다.");
	}

}
