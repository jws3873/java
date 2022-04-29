package string;
// 대표적인 final클래스는 String과 Math가 있다.
public class Ex02 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "java";
		
		System.out.println("str1 문자열 주소 >>> "+System.identityHashCode(str1));
		System.out.println("str2 문자열 주소 >>> "+System.identityHashCode(str2));
		System.out.println();
		
		//문자열 연산(결합)
		
		str1 = str1+str2;
		System.out.println("str1 문자열 주소 >>> "+System.identityHashCode(str1));
		
		
	}

}
