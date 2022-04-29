package accessTwo;

import accessOne.Super;

public class Sub extends Super{
	public static void main(String[] args) {
		Sub sub = new Sub();
		
		//해당 클래스에서만 접근이 가능 - private
//		System.out.println("num1 >>> "+sub.num1);
	
		// 같은 패키지에서만 접근이 가능 - default
		//상속 관계에 있는 다른 패키지의 멤버라도 접근이 불가능
//		System.out.println("num2 >>> "+sub.num2);
		
		// 같은 패키지+상속관계 접근이 가능 - default
		System.out.println("num3 >>> "+sub.num3);
		
		// 모든 클래스에서 접근이 가능 - default
		System.out.println("num4 >>> "+sub.num4);
		
		
}
}
