package khie;

/*
 * [문제] 임의의 숫자 하나를 키보드로부터 입력을 받아서
 * 		그 숫자의 제곱과 세제곱을 구해보자.
 */

public class Exam_02 {

	public static void main(String[] args) {
		//1. 임의의 숫자 하나를 키보드로부터 입력을 받아보자.
		int num = Integer.parseInt(args[0]);
		System.out.println("입력받은 정수 >>> "+num);
		
		//2. 임의의 숫자의 제곱을 구해야 한다.
		//형식) 임의의 숫자 *임의의 숫자
		System.out.println("제곱 >>> "+(num*=num));
		
		//3. 임의의 숫자의 세제곱을 구해야 한다.
		//형식) 임의의 숫자*임의의 숫자*임의의 숫자
		System.out.println("세제곱 >>> "+(num*=num));
	}

}
