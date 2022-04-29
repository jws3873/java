package abstracts;

public class Ex01_Super{

	public static void main(String[] args) {
//		Super s = new Super(); //추상메서드를 재정의 하지 않으면 객체생성시 error 발생
		Sub s = new Sub();
		s.num1 = 135;
		
		
		System.out.println("calc() 메서드 호출 >>>"+ s.calc());
		s.output();
		

	}

}
