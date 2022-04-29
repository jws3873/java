package khie;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로부터 입력받은 점수가 60 점 이상이면
 * "합격" 이라는 메세지를 화면에 출력해 보세요.
 */

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int num = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));
		if(num >= 60) {
			System.out.println("합격");
		}
		System.out.println("프로그램 종료");
	}

}
