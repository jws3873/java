package Ploymorphism;

public class Ex01_Animal {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.sound1();
		dog.output();
		Animal dog2 = new Dog();
		Dog dog3 = null;
		Animal dog4 = null;
		dog2.sound1();
//		dog2.output(); // 조상타입의 참조변수로 생성된 객체는 조상타입의 멤머만 접근할 수 있다.
		dog3 = (Dog)dog2; // 조상타입의 자손객체는 자손타입으로 변경될 때 ()를 통해 참조변수타입을 변환해 준다.
		dog4 = (Animal)dog3; //타손타입의 객체는 조상타입으로 변경될 때 ()를 생략할 수 있다.
	}

}
