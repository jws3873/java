package khie;

import java.util.Scanner;

/*
 * 다중 if~else문 -분기문(조건문)
 * - 여러 개의 조건문 중에 맞은 조건에 해당하는 문장을 실행하는 구조.
 * 
 * 형식)
 * if(조건식1){
 * 조건식1이 참인 경우 실행문장;
 * }
 * else{
 * if(조건식2){
 * 			조건식 1은 거직이고(and), 조건식2는 참인경우 실행문장;
 * 		}else{
 * 			if(조건식3){
 * 				조건식1, 조건식2가 거짓이고 , 조건식 3은 참인경우 실행 문장;
 * 			}else{
 * 				조건식1,2,3이 모두 거짓인 경우 실행문장;
 * 			}
 * 		}
 * }
 * 
 * 	==> if(조건식1){
 * 		}
 * 		else if(조건식2){
 * 		조건식 1은 거직이고(and), 조건식2는 참인경우 실행문장;
 * 		}
 * 		else if(조건식3){
 * 		조건식1, 조건식2가 거짓이고 , 조건식 3은 참인경우 실행 문장;
 * 		}else{
 * 		건식1,2,3이 모두 거짓인 경우 실행문장;
 * 		}
 * 
 */

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3 사이의 숫자 중 하나를 입력하세요.>>>");
		int su = sc.nextInt();
		
		if(su==1) {
			System.out.println("입력받은 숫자는 1입니다.");
		}else if(su == 1) {
			System.out.println("입력받은 숫자는 2입니다.");
		}else if(su == 3) {
			System.out.println("입력받은 숫자는 3입니다.");
		}else {
			System.out.println("입력받은 숫자는 1~3 이외의 숫자입니다.");
		}
		sc.close();
		
	}

}
