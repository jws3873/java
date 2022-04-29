package khie;

import java.util.Scanner;

/*
 * [문제] 키보드로 점수를 입력받아서 입력받은 점수가 
 * 60점 이상이면 "합격" 이라는 문자열을 화면에 
 * 출력하고, 그렇지 않으면 "불합격" 이라는 
 * 문자열을 화면에 출력해 보세요. 
 */

public class Ex09 {

	public static void main(String[] args) {
//		int num = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하시오."));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num >=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		sc.close();
	
		
	}

}
