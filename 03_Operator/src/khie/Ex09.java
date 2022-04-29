package khie;

import java.util.Scanner;

//키보드로부터 두 개의 숫자를 입력을 받자.
//입력 받은 두 수를 이용하여 산술연산을 진행해 보자.

public class Ex09 {

	public static void main(String[] args) {
		
		//1. 키보드로부터 두 개 의 숫자를 입력을 받자.
		//	입력 받은 두 수를 숫자로 변환을 시키자.
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		//2. 두 수를 가지고 산술연산을 진행해 보자.
		System.out.println("num1 + num2 >>> "+(num1+num2));
		System.out.println("num1 - num2 >>> "+(num1-num2));
		System.out.println("num1 * num2 >>> "+(num1*num2));
		System.out.println("num1 / num2 >>> "+(num1/num2));
		System.out.println("num1 % num2 >>> "+(num1%num2));
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오");
		int num3 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두번째 숫자를 입력하시오");
		int num4 = sc2.nextInt();
		
		System.out.println("num3 + num4 >>> "+(num3+num4));
		System.out.println("num3 - num4 >>> "+(num3-num4));
		System.out.println("num3 * num4 >>> "+(num3*num4));
		System.out.println("num3 / num4 >>> "+(num3/num4));
		System.out.println("num3 % num4 >>> "+(num3%num4));
		
		

	}

}
