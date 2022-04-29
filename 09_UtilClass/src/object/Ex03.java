package object;
class Gneric<T>{
	T[] arr;
	T i;
	
	public Gneric(T[] arr,T i) {
		this.arr = arr;
		this.i = i;
	}
	public void output() {
		for(T k : arr) {
			System.out.println("arr : " +k );
		}
		System.out.println("i : "+i);
	}
	
	
}
public class Ex03 {

	public static void main(String[] args) {
		
		//String 배열 객체 생성
		String[] str = new String[4];
		str[0] = "홍길동";
		str[1] = "hong";
		str[2] = "서울시 은평구 증산로";
		str[3] = "010-111-1234";
//		str[3] = String.valueOf(123);
		for(String k : str) {
			System.out.println("str 배열 요소 >>> "+ k);
		}
		System.out.println();
		
		//Object 배열 객체 생성
		Object[] obj = new Object[4];
		obj[0] = "이순신"; //문자열(String) 자료형
		obj[1] = 150;	// 정수(int) 자료형
		obj[2] = true;	// boolean 자료형
		obj[3] = 3.15;	//실수 (double) 자료형
		
		for(Object k : obj) {
			System.out.println("obj 배열 요소 >>> "+ k);
		}
		System.out.println(String.valueOf(str[3]));
		
		Integer[] arr = {1,2,3,4,5};
		Integer i = 10;
		String  st= "hi";
		Gneric<Integer> gneric = new Gneric<Integer>(arr,i);
		gneric.output();
		
		
	}

}
