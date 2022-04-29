package inner;

/*
 * 다양한 형태의 클래스 선언 방법
 * 1. 일반적인 선언방법
 * ==> 하나의 java파일에 class 키워드를 작성하여 클래스 선언
 * 2. 무명클래스(ananymous calss) 선언
 * ==> 이름이 없는 클래스 선언. interface 객체 생성 시 많이 사용 됨.
 * 3. 중첩클래스(inner class) 선언
 * ==> 클래스 안에 또 다른 클래스 선언
 * 
 */

public class Ex01_inter {

	public static void main(String[] args) {
		// 1. 일반적인 선언 방법.
		//Sub 객체 생성
		Sub sub = new Sub();
		
		System.out.println("sum()메서드 호출 : "+ sub.sum(200, 15));
		System.out.println("sum()메서드 호출 : "+ sub.minus(127, 15));
		System.out.println();
		
		// 2. 무명클래스(ananymous class) 선언
//		Inter inter2 = new Inter(); 인터페이스는 new키워드라 생성자로 객체를 생성할 수 없다.
		Inter inter = new Inter() {// 생성과 동시에 인터페이스 객체 구현까지 선언
			
			@Override
			public int sum(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1+n2;
			}
			
			@Override
			public int minus(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1-n2;
			}
		};
		System.out.println("sum()메서드 호출 : "+ inter.sum(200, 15));
		System.out.println("sum()메서드 호출 : "+ inter.minus(127, 15));
		System.out.println();
	}

}
