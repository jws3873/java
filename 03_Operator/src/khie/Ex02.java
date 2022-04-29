package khie;

/*
 * 2. 관계연산자(비교연산자)
 * - >=(크거나 같은지), >(큰지), <=(작거나 같은지)
 * 	 <(작은지), ==(같은지), !=(같지않은지)
 * - 결과는 boolean 형으로 결과가 나타남. ==> true / false 로 결과가 나옴.
 * - 관계연산자는 체어문(조건문) 에서 가장 많이 사용되는 연산자.
 */
public class Ex02 {

	public static void main(String[] args) {
		int su1 = 10, su2 = 5;
		
		System.out.println("(su1>=su2) 결과 >> "+ (su1>=su2));
		System.out.println();
		
		System.out.println("(su1>su2) 결과 >> "+ (su1>su2));
		System.out.println();
		
		System.out.println("(su1<=su2) 결과 >> "+ (su1<=su2));
		System.out.println();
		
		System.out.println("(su1<su2) 결과 >> "+ (su1<su2));
		System.out.println();
		
		System.out.println("(su1==su2) 결과 >> "+ (su1==su2));
		System.out.println();
		
		System.out.println("(su1!=su2) 결과 >> "+ (su1!=su2));
		System.out.println();
	}

}
