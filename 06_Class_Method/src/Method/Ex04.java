package Method;

import java.util.Scanner;

// 간단한 계산기 예제

public class Ex04 {
	public static int plus(int x,int y) {
		System.out.println("덧셈 >>> "+(x+y));
		return (x+y);
	}
	public static int minus(int x,int y) {
		System.out.println("뺄셈 >>> "+(x-y));
		return (x-y);
	}
	public static int multiply(int x,int y) {
		System.out.println("곱셈 >>> "+(x*y));
		return (x*y);
	}
	public static int devide(int x,int y) {
		System.out.println("나눗셈 >>> "+(x/y));
		return (x/y);
	}
	public static int  mod(int x,int y) {
		System.out.println("나머지 >>> "+(x%y));
		return (x%y);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 키보드로부터 2개의 정수와 연산자를 입력받자.
		System.out.print("첫번째 정수 입력:");
		int x = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		int y = sc.nextInt();
		System.out.print("연산자 입력:");
		String op = sc.next(); 
		// 연산자 변수에 입력된 연산기호를 가지고 
		// 해당 기호에 맞는 메서드를 호출해 보자.
		int result = 0;
		switch(op) {
		case "+": result = plus(x,y); break;
		case "-": result = minus(x,y); break;
		case "*": result = multiply(x,y); break;
		case "/": result = devide(x,y); break;
		case "%": result = mod(x,y); break;
		default:
		}
		System.out.println(x+op+y+"의연산결과"+result);
		sc.close();
		
	}	

}
