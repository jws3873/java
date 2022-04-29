package khie;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로부터 입력받은 정수값이 음수이면
 * "입력받은 정수는 음수입니다." 라는 메세지를
 * 콘솔화면에 출력해 보세요.
 */

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int su = Integer.parseInt(JOptionPane.showInputDialog("정수값을 입력하시오"));
		if(su<0) {
			System.out.println("입력받은 정수"+su+"는 음수입니다.");
		}
		System.out.println("프로그램 종료");
		
	}

}
