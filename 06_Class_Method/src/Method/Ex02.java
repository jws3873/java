package Method;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		//[문제] 1부터 키보드로 입력받은 수까지의 합을 구하는
		//메서드를 호출해 보세요.
		sum();
		System.out.println("프로그램 종료");
		
	}

	public static void sum() {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int sum =0;
		for(int i =1;i<=num;i++) {
			sum +=i;		
			}
		System.out.println("1부터" +num+"까지의 합은 "+sum+"입니다.");
		sc.close();
		}

}
