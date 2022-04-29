package khie;

import java.util.Scanner;

/*
 * 1~100 사이의 정수 중에서 키보드로 
 * 5개의 정수를 입력받아서 5개의 정수중에서 
 * 최대값을 화면에 출력해 보세요
 */
public class Ex25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = 0,tem = 0;
		
		System.out.println("1~100 사이의 정수를 입력해 주세요");
		for(int i =1;i<=5;i++) {
			System.out.print("정수를 입력해 주세요 : ");
			tem = sc.nextInt();
			if(0<tem&&tem<=100) {
				if(tem>max) max=tem;
			}else {
				System.out.println("1~100사이의 정수가 아닙니다.");
				break;
			}
		}
		
		System.out.println("max >>> "+max);
		
		sc.close();
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int max =0;
//		int tem = 0, su =1;
//		
//		System.out.println("1부터 100까지의 정수를입력하시오");
//		while(su<=5) {
//			System.out.print(su+"번째 정수 입력");
//			tem = sc.nextInt();
//			if(tem<=100) {
//			if(tem>max) {
//				max = tem;
//			}
//			su++;
//			}else {
//				System.out.println(su+"번째 정수는 1부터 100까지의 정수가 아닙니다."); break;
//			}
//		}
//		System.out.println("최대값은 "+max+"입니다.");
//		sc.close();
	}

}
