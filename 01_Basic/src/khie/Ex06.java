package khie;

public class Ex06 {

	public static void main(String[] args) {
		float f =123.123711f;
		float f2 =123.12f;
		// system.out.printf()
		// 형식에 맞게 출력하는 메서드.
		System.out.printf("%2d%n",1);
		System.out.printf("%o%n",10);
		System.out.printf("%x%n",10);
		System.out.printf("%s%n","문자열 출력");

		
		
		System.out.printf("%.0f",23.2585);
		//형식("%전체자릿수.소수점자릿수.f)
		// ==> 즉, 전체 자릿수는 4자리로하고, 소숫점 아래는 2자리까지 표현.
		// 전체자리수는 의미가 없다. 그냥 0.2라고 생각하면 된다.
		System.out.printf("%n%f",5.2585);
		
		System.out.println();
		System.out.printf("%n[%f]",f);
		System.out.printf("%n[%013f]",f);
		System.out.printf("%n[%010.2f]",f);
		System.out.printf("%n[%010.2f]",f);
	}

}
