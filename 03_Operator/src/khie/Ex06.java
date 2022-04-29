package khie;

/* 
 * 6. 비트연산자
 * 	-비트(0,1)를 이용하여 연산하는 연산자.
 * 	- &(and) : 두 비트 조건이 참(1) 인 경우 1을 반환, 그 외에는 0을 반환.
 * 	- |(or) : 두 비트 중 하나만 조건이 참(1) 이면 1을 반환, 그외에는 0일 반환.
 *  - ^(xor) : 두 비트 중 서로 다른 경우에만 1을 반환, 그 외에는 0을 반환.
 *  - 비트연산을 하기 위해서는 십진수를 이진수로 변환
 */

public class Ex06 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 5, result;
		
		// 비트연산을 하기 위해서는 십진수를 이진수로 변환
		//num1 = 1010,num2 = 0101
		String binaryString1 = Integer.toBinaryString(num1);
		String binaryString2 = Integer.toBinaryString(num2);
		System.out.println(binaryString1);
		System.out.println(binaryString2);
		
		//and 연산
		result = num1 & num2;
		System.out.println("result >>> "+result);
		System.out.println();
		
		//or 연산
		result = num1 | num2;
		System.out.println("result >>> "+result);
		System.out.println();
		
		//xor 연산 
		num2 = 8;
		result = num1 ^ num2;
		System.out.println("result >>> "+result);
		System.out.println();
	}

}
