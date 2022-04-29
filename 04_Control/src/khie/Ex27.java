package khie;

/*
 * for 반복문(★★★★★★★★★★★★★★★★★★)
 * - 변수의 값을 이용하여 반복 실행하는 명령문.
 * - 일정 횟수에 대한 반복을 구현할 때 효율적으로 사용되는 반복문.
 * 즉, 반복문의 횟수를 알고 있는 경우에 자주 사용됨.
 * 형식)
 * for(초기식;조건식;증감식){
 * 반복실행문장;
 * }
 * [for 반복문 실행 순서]
 * 1. 초기식 : 처음에 한번만 실행된 (변수선언)
 * 2. 조건식 : 조건이 참이면 반복, 거짓이면 탈출(exit)
 * 3. 실행문 : 조건이 참일 때 반복 대상인 반복 실행문이 실행됨.
 * 4. 증감식 : 변수를 대상으로 증가(++) 또는 감소 (--)
 */

public class Ex27 {

	public static void main(String[] args) {
		// while 반복문을 이용하여 1~10까지 출력
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		//for 반복문을 이용하여 1~10 까지 출력을 해보자
		for(int j = 1; j<=10;j++) {
			System.out.println(j);
		}
	}

}
