package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력받은 정수가
 * 홀수 인지 짝수인지 판별해 보세요...
 */

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수값을 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num!=0) {
			if((num%=2)==0) System.out.println("짝수입니다.");
			
			else System.out.println("홀수입니다.");
		}else System.out.println("0이외의 값을 입력하시오");
		sc.close();
	}

}
