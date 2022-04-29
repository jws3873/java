package Method;

/*
 * 메서드 다중정의(method overloading)
 * - 동일한 클래스에서 동일한 이름의 메서드가 여러 개 정의되는 자바 문법.
 * - 일관된 이름을 정의할 수 있어서 개발자(사용자)에게 코드의 직관성을 제공함.
 * 
 * [메서드 다중정의 규칙]
 * 1. 메서드 이름이 동일해야 함.
 * 2. 반드시 매개변수의 갯수가 같은 경우 매개변수의 자료형이 달라야 함.
 *    또는 매개변수의 갯수가 달라야 함.
 * 3. 리턴타입(반환형)은 무관함.
 */

import java.util.Scanner;

public class Ex10 {
	
	// 2과목의 총점을 구하는 메서드
	public static int sum(int k, int e) {
		return k + e;
	}
	
	// 3과목의 총점을 구하는 메서드
	public static int sum(int k, int e, int m) {
		return k + e + m;
	}
	
	// 4과목의 총점을 구하는 메서드
	public static int sum(int k, int e, int m, int j) {
		return k + e + m + j;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 >>> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 >>> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 >>> ");
		int mat = sc.nextInt();
		
		System.out.print("자바 점수 입력 >>> ");
		int java = sc.nextInt();
		
		System.out.println();
		
		System.out.println("2과목 총점 >>> " + sum(kor, eng));
		
		System.out.println("3과목 총점 >>> " + sum(kor, eng, mat));
		
		System.out.println("4과목 총점 >>> " + sum(kor, eng, mat, java));

		sc.close();

	}

}
