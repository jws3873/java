package abstracts;

public class Sub extends Super{// 추상클래스를 상속받게 되면 상속받은 자손 클래스는 추상메서드를 구현하여야 한다. 그렇지 않으면 error발생
	void output() {
		System.out.println("추상메서드 재정의");
	}
}
