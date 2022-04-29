package interfaces;



public class Sub implements Inter{  // 인터페이스는 다중상속이 가능하다.
@Override
public void output1() {
	System.out.println("인터페이스 output1()추상메서드 재정의");
	
}
@Override
	public void output2() {
	System.out.println("인터페이스 output2()추상메서드 재정의");		
	}

}
