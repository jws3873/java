package khie;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로 입력받은 정수가 5로 나누어 떨어지면
 * "이 정수는 5의 배수입니다." 라고 메세지를 화면에 출력해 보세요.
 */

public class Ex03 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요"));
//		System.out.println("정수를 입력하시오");
//		Scanner sc = new Scanner(System.in);
//		int num2 = sc.nextInt();
		System.out.println("프로그램 시작");
		if((num%5)==0) {
			System.out.println("이 정수는 5의 배수입니다.");
		}
		System.out.println("프로그램 종료");
		
	}

}
